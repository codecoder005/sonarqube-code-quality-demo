package com.orgofarmsgroup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@SpringBootApplication
@EnableSwagger2
public class SonarqubeCodeQualityDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SonarqubeCodeQualityDemoApplication.class, args);
	}

	@Bean
	public Docket swaggerConfiguration(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/api/v1/users/**"))
				.apis(RequestHandlerSelectors.basePackage("com.orgofarmsgroup"))
				.build()
				.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo(){
		return new ApiInfo(
				"Users API",
				"This API manages and provides information about users",
				"1.0",
				"Open Source",
				new Contact("Ramakrishna Janaureddy", "www.google.co.in", ""),
				"Apache License Version 2.0",
				"www.apache.org/licenses/LICENSE-2.0",
				new ArrayList<>()
		);
	}
}
