package com.netbuilder.jms;

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

	public void start(String queue) {

	}

	public TestListener getTestListener() {
		return testListener;
	}

	public void setTestListener(TestListener testListener) {
		this.testListener = testListener;
	}
}
