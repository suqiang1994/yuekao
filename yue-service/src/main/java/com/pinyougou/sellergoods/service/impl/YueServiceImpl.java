package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.mapper.YueMapper;
import com.pinyougou.sellergoods.service.yueService;
import com.wwh.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import java.util.List;

/**
 * Created by 西瓜都不酸 on 2019/10/28.
 */
@Service
public class YueServiceImpl implements yueService {

    @Autowired
    private YueMapper mapper;

    @Autowired
    private JmsTemplate jms;



    public void jms(){
        jms.send("123", new MessageCreator() {
            @Override
       public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage("2211");
            }
        });

    }


    @Override
    public List<Goods> list() {
        return mapper.list();
    }
}
