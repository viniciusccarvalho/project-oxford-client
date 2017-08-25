/*
 *  Copyright 2016 original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package ai.projectoxford.face;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import ai.projectoxford.AbstractAsyncClient;
import ai.projectoxford.ApiKeyRequestInterceptor;
import org.apache.commons.io.IOUtils;
import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxSink;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.client.AsyncRestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * @author Vinicius Carvalho
 */
public class Face extends AbstractAsyncClient{


	private String BASE_URL = OXFORD_BASE_URL + "/face/v1.0";

	public Face(String key, AsyncRestTemplate asyncRestTemplate) {
		super(asyncRestTemplate);
		this.client.getInterceptors().add(new ApiKeyRequestInterceptor(key));
	}

	public Flux<FaceResponse> detect(boolean faceId, boolean faceLandmarks, String imageUrl, String ... faceAttributes){
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.CONTENT_TYPE,"application/json");
		HttpEntity<Map<String,String>> request = new HttpEntity<Map<String, String>>(Collections.singletonMap("url",imageUrl),headers);
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(BASE_URL+"/detect");
		builder.queryParam("returnFaceId",faceId)
				.queryParam("returnFaceLandmarks",faceLandmarks)
				.queryParam("returnFaceAttributes", StringUtils.arrayToCommaDelimitedString(faceAttributes));

		return futureToFlux(client.exchange(builder.build().toUri(),HttpMethod.POST,request,new ParameterizedTypeReference<List<FaceResponse>>(){}));
	}

	public Flux<FaceResponse> detect(boolean faceId, boolean faceLandmarks, InputStream image, String ... faceAttributes){
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			IOUtils.copy(image,baos);
		}
		catch (IOException e) {
			throw new RuntimeException(e);
		}
		return detect(faceId,faceLandmarks,baos.toByteArray(),faceAttributes);
	}

	public Flux<FaceResponse> detect(boolean faceId, boolean faceLandmarks, byte[] image, String ... faceAttributes){
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.CONTENT_TYPE,"application/octet-stream");
		HttpEntity<byte[]> request = new HttpEntity<>(image,headers);
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(BASE_URL+"/detect");
		builder.queryParam("returnFaceId",faceId)
				.queryParam("returnFaceLandmarks",faceLandmarks)
				.queryParam("returnFaceAttributes", StringUtils.arrayToCommaDelimitedString(faceAttributes));
		return futureToFlux(client.exchange(builder.build().toUri(),HttpMethod.POST,request,new ParameterizedTypeReference<List<FaceResponse>>(){}));
	}

	public Flux<SimilarResponse> findSimilar(SimilarRequest similarRequest){
		HttpEntity<SimilarRequest> request = new HttpEntity<>(similarRequest);
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(BASE_URL+"/findsimilars");
		return futureToFlux(client.exchange(builder.build().toUri(), HttpMethod.POST, request, new ParameterizedTypeReference<List<SimilarResponse>>() {}));
	}


	static  <T> Flux<T> futureToFlux(ListenableFuture<ResponseEntity<List<T>>> future){
		return Flux.create(emitter ->{
			future.addCallback(result -> {
				result.getBody().forEach(item -> {emitter.next(item);});
				emitter.complete();
			}, ex -> {
				emitter.error(ex);
			});
		});
	}


	public FaceList faceList(){
		return new FaceList();
	}

	public Person person(){
		return new Person();
	}

	public PersonGroup personGroup(){
		return new PersonGroup();
	}

	public class FaceList {

	}

	public class Person {

	}

	public class PersonGroup {

	}

}
