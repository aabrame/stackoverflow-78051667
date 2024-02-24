package com.example.stackoverflow78051667;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

@SpringBootApplication
public class Stackoverflow78051667Application {

	public static void main(String[] args) {
		SpringApplication.run(Stackoverflow78051667Application.class, args);
	}

	@Bean
	public Supplier<List<Message<String>>> batch() {
		return () -> {
			List<Message<String>> list = new ArrayList<>();
			list.add(MessageBuilder.withPayload("message - 1").build());
			list.add(MessageBuilder.withPayload("message - 2").build());
			list.add(MessageBuilder.withPayload("message - 3").build());
			list.add(MessageBuilder.withPayload("message - 4").build());
			return list;
		};
	}
}
