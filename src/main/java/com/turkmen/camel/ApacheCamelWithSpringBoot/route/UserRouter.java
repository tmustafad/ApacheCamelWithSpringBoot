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
		this.queueName = "amqp:TURKMEN_USER";
		this.urlName = "user";
	}

}
