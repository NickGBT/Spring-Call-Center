package com.netbuilder.jms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;


/**
 * 
 * @author Alexander Neil
 *
 */
public class MessageReceiver {

	private JmsTemplate jmsTemplate;

	private TestListener testListener;

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	public Object receive() {
		return jmsTemplate.receiveAndConvert("test-queue");
	}

	public static MessageReceiver start(String queue) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		MessageReceiver messageReceiver = (MessageReceiver) context.getBean("messageReceiver");
		
		return messageReceiver;
	}

	public TestListener getTestListener() {
		return testListener;
	}

	public void setTestListener(TestListener testListener) {
		this.testListener = testListener;
	}
}
