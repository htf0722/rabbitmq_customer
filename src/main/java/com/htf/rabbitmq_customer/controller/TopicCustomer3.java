package com.htf.rabbitmq_customer.controller;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author ：贺天峰
 * @date ：Created in 2019/6/10 15:29
 * @description：
 * @modified By：修改人
 * @version: $
 */
@Component
@RabbitListener(queues="test3" )
public class TopicCustomer3 {
    @RabbitHandler
    public void showMessage(String message){
        System.out.println("Customer3接收到消息："+message);
    }
}
