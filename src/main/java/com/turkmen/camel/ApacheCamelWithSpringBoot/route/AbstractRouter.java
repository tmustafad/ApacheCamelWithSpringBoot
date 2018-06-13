/**
 * 
 */
package com.turkmen.camel.ApacheCamelWithSpringBoot.route;

import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;

/**
 * @author TTTDEMIRCI
 *
 */
public class AbstractRouter  extends RouteBuilder{
	
	protected String urlName;
	
	protected String queueName;

	@Override
	public void configure() throws Exception {
		
//		restConfiguration().component("servlet").bindingMode(RestBindingMode.json);
//		rest("/"+urlName+"").description(urlName+" service!").produces("application/json").get("{name}").route().transform()
//		.simple("${header.name}, is consumed").process(exchange ->{
//			exchange.getIn().setHeader(Exchange.HTTP_RESPONSE_CODE, 200);
//			exchange.getIn().setHeader(Exchange.CONTENT_TYPE, "application/json");
//		}) ;
		
		restConfiguration().component("servlet").bindingMode(RestBindingMode.json);
		rest("/"+urlName+"").description(urlName+" service!").produces("application/json").get("{name}").route().transform()
		.simple("${header.name}, is consumed").to(ExchangePattern.InOnly, queueName);
		
		
	
	}

	
	
}
