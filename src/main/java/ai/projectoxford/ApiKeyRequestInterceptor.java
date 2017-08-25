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

package ai.projectoxford;

import java.io.IOException;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.AsyncClientHttpRequestExecution;
import org.springframework.http.client.AsyncClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.util.concurrent.ListenableFuture;

/**
 * @author Vinicius Carvalho
 */
public class ApiKeyRequestInterceptor implements AsyncClientHttpRequestInterceptor {

	private final String key;
	private final String API_HEADER_NAME = "Ocp-Apim-Subscription-Key";

	public ApiKeyRequestInterceptor(String key) {
		this.key = key;
	}

	public ListenableFuture<ClientHttpResponse> intercept(HttpRequest request, byte[] body, AsyncClientHttpRequestExecution execution) throws IOException {
		request.getHeaders().add(API_HEADER_NAME,key);
		ListenableFuture<ClientHttpResponse> responseFuture = execution.executeAsync(request,body);
		return responseFuture;
	}
}
