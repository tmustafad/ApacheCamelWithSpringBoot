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
public class LoginRouter extends AbstractRouter {
	
	{
		this.queueName="amqp:TURKMEN_LOGIN";
		this.urlName="login";
	}


}
