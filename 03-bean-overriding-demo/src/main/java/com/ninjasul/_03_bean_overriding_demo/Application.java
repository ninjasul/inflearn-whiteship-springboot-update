package com.ninjasul._03_bean_overriding_demo;

import com.ninjasul._02_bean_overriding_familyman_prep.FamilyMan;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public FamilyMan familyMan() {
		FamilyMan familyMan = new FamilyMan();
		familyMan.setName("ninjasul");
		return familyMan;
	}

	@Bean
	public ApplicationRunner applicationRunner() {
		return new ApplicationRunner() {
			@Autowired
			private FamilyMan familyMan;

			@Override
			public void run(ApplicationArguments args) throws Exception {
				log.info("==========================");
				log.info("familyMan name: {}", familyMan.getName());
				log.info("==========================");
			}
		};
	}
}
