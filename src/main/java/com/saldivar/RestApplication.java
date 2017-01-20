package com.saldivar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import com.saldivar.config.PostUrl;
import com.saldivar.databinder.Address;

@SpringBootApplication
public class RestApplication {

	private static final Logger log = LoggerFactory.getLogger(RestApplication.class);

	public static void main(String args[]) {

		PostUrl postUrl = SpringApplication.run(RestApplication.class, args).getBean(PostUrl.class);
		RestTemplate restTemplate = new RestTemplate();
		Address address = restTemplate.getForObject(postUrl.toString(), Address.class);
		log.info(address.toString());
	}
}
