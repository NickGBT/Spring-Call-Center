package com.netbuilder.jms;

import java.util.List;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;

/**
 * 
 * @author Alexander Neil
 *
 */

public class TestListener implements MessageListener {

	@Override
	public void onMessage(Message message) {

		//System.out.println("MESSAGE!");

		if (message instanceof TextMessage) {
			try {
				System.out.println(((TextMessage) message).getText());
			} catch (JMSException e) {
				e.printStackTrace();
			}
		} else if (message instanceof ObjectMessage) {
			Object payload;
			try {
				payload = ((ObjectMessage) message).getObject();

			} catch (JMSException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("lolno");
		}
	}

}
