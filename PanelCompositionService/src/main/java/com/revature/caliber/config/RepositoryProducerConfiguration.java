package com.revature.caliber.config;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.revature.caliber.service.PanelCompositionMessagingService;

@Configuration
public class RepositoryProducerConfiguration {
	@Autowired
    private PanelCompositionMessagingService mms;
    
    @Bean
    public AmqpTemplate rabbitTemplate(ConnectionFactory factory) {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(factory);
        rabbitTemplate.setExchange("revature.caliber.repos");
        return new RabbitTemplate(factory);
    }
    
    @Bean
    public CommandLineRunner runner() {
        return args -> {
            mms.send("B8ptbVDNyVB28mVA", "repositoryProducer saying hi!");
        };
    }
}