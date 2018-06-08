package com.turkmen.camel.ApacheCamelWithSpringBoot;

import org.apache.activemq.jms.pool.PooledConnectionFactory;
import org.apache.camel.component.amqp.AMQPComponent;
import org.apache.qpid.jms.JmsConnectionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.turkmen.camel.ApacheCamelWithSpringBoot.config.AMQPConfiguration;

@SpringBootApplication
public class ApacheCamelWithSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApacheCamelWithSpringBootApplication.class, args);
	}

	 @Bean(name = "amqp-component")
	    AMQPComponent amqpComponent(AMQPConfiguration config) {
	        JmsConnectionFactory qpid = new JmsConnectionFactory(config.getUsername(), config.getPassword(), "amqp://"+ config.getHost() + ":" + config.getPort());
	        qpid.setTopicPrefix("queue://");

	        PooledConnectionFactory factory = new PooledConnectionFactory();
	        factory.setConnectionFactory(qpid);

	        return new AMQPComponent(factory);
	    }

}
