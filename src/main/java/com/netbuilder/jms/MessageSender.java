package com.netbuilder.jms;

import org.springframework.jms.core.JmsTemplate;

/**
 * 
 * @author Alexander Neil
 *
 */
public class MessageSender {

	private JmsTemplate jmsTemplate;
	
	public void setJmsTemplate(JmsTemplate jmsTemplate){
		this.jmsTemplate = jmsTemplate;
	}
	
	public void send(String destination, final Object object){
		jmsTemplate.convertAndSend(destination, object);
	}
}
