package com.tahrioussama;

import com.tahrioussama.kafka.WikimediaChangesProducer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootProducerApplication.class);
    }

    @Bean
    CommandLineRunner commandLineRunner(WikimediaChangesProducer wikimediaChangesProducer) {
        return args -> {
            wikimediaChangesProducer.sendMessage();
        };
    }
}