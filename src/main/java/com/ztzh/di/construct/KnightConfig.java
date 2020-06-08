package com.ztzh.di.construct;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {

	@Bean
	public Knight knight() {
		return new Knight(quest());
	}

	@Bean
	public Quest quest() {
		return new SlaveDragonQuest(System.out);
	}
}
