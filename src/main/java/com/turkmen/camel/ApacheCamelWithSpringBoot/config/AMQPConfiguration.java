/**
 * 
 */
package com.turkmen.camel.ApacheCamelWithSpringBoot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author TTTDEMIRCI
 *
 */
@Configuration
@ConfigurationProperties(prefix = "amqp")
public class AMQPConfiguration {
	/**
	 * AMQ service host
	 */
	private String host;

	/**
	 * AMQ service port
	 */
	private Integer port;

	/**
	 * AMQ username
	 */
	private String username;

	/**
	 * AMQ password
	 */
	private String password;

	public AMQPConfiguration() {
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
