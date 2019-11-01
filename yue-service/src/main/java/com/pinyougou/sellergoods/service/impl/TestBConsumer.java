package com.pinyougou.sellergoods.service.impl;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created by 西瓜都不酸 on 2019/10/28.
 */
public class TestBConsumer implements MessageListener {
    @Override
    public void onMessage(Message message) {
        // myQueueB的消费者
        try {
            String text = ((TextMessage) message).getText();
            System.out.println(this.getClass().getSimpleName() + "接受到消息---->" + text);
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

}
