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

package ai.projectoxford.config;

import ai.projectoxford.face.Face;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.Netty4ClientHttpRequestFactory;
import org.springframework.web.client.AsyncRestTemplate;

/**
 * @author Vinicius Carvalho
 */
@Configuration
public class OxfordAutoConfiguration {

	@Bean
	@ConditionalOnProperty(name = "azure.cognitive.face.key")
	public Face faceClient(@Value("${azure.cognitive.face.key}") String key, AsyncRestTemplate asyncRestTemplate){
		return new Face(key,asyncRestTemplate);
	}

	@Bean
	@ConditionalOnMissingBean
	public AsyncRestTemplate asyncRestTemplate() {
		return new AsyncRestTemplate(new Netty4ClientHttpRequestFactory());
	}

}
