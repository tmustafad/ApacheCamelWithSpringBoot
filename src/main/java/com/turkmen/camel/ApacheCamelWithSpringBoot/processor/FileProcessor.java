/**
 * 
 */
package com.turkmen.camel.ApacheCamelWithSpringBoot.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

/**
 * @author TTTDEMIRCI
 *
 */
@Component
public class FileProcessor implements Processor {

	public void process(Exchange arg0) throws Exception {
		String originalFileContent = arg0.getIn().getBody(String.class);
		String upperCaseFileContent = originalFileContent.toUpperCase();
		arg0.getIn().setBody(upperCaseFileContent);

	}
}
