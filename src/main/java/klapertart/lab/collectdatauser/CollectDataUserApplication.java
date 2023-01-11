package klapertart.lab.collectdatauser;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

@SpringBootApplication
public class CollectDataUserApplication {

	@Bean
	public NewTopic initTopic(){
		return TopicBuilder
				.name("user-profile")
				.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(CollectDataUserApplication.class, args);
	}

}
