/**
 * 
 */
package com.turkmen.camel.ApacheCamelWithSpringBoot.route;

import org.springframework.stereotype.Component;

/**
 * @author TTTDEMIRCI
 *
 */
@Component
public class UserRouter extends AbstractRouter {

	{
		this.queueName="amqp:TURKMEN_USER";
		this.urlName="user";
	}
	
	
//	@Override
//	public void configure() throws Exception {
//
//		restConfiguration().component("servlet").bindingMode(RestBindingMode.json);
//
//		rest("/user").produces("application/json").get("{name}").route().transform()
//				.simple("Hello ${header.name}, fenerbahce").to(ExchangePattern.InOnly, "amqp:TURKMEN_TEST")
//				.process(exchange -> {
//					exchange.getIn().setBody("{'success':'success'}");
//					exchange.getIn().setHeader(Exchange.HTTP_RESPONSE_CODE, 200);
//					exchange.getIn().setHeader(Exchange.CONTENT_TYPE, "application/json");
//				});
//
//	}

}
