/**
 * 
 */
package com.turkmen.camel.ApacheCamelWithSpringBoot.route;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * @author TTTDEMIRCI
 *
 */
@Component
public class Router extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		// from("timer:initial//start?period=1000")
		// .routeId("TIMER_ROUTE")
		// .to("amqp:queue:TURKMEN_TEST");

//		from("file:input/sample.txt?autoCreate=true").process(new Processor() {
//
//			@Override
//			public void process(Exchange exchange) throws Exception {
//				String originalFileContent = exchange.getIn().getBody(String.class);
//				String upperCaseFileContent = originalFileContent.toUpperCase();
//				exchange.getIn().setBody(upperCaseFileContent);
//
//			}
//		}).routeId("TURKMEN_ROUTER").to("file:output/sample.txt?autoCreate=true");

		
		
		from("file://input/").convertBodyTo(String.class).to("amqp:queue:TURKMEN_TEST");
	}

}
