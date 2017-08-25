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

package ai.projectoxford.boot;

import ai.projectoxford.face.Face;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Vinicius Carvalho
 */
@RunWith(SpringRunner.class)
public abstract class AutoConfigureTests {


	@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE, properties = {"azure.cognitive.face.key=foo"}, classes = OxfordTestApplication.class)
	public static class FaceIntegrationTests extends AutoConfigureTests{
		@Autowired
		private Face face;

		@Test
		public void tests() throws Exception {
			Assert.assertNotNull(face);
		}
	}


	@SpringBootApplication
	public static class OxfordTestApplication {
		public static void main(String[] args) {
			SpringApplication.run(OxfordTestApplication.class,args);
		}
	}

}
