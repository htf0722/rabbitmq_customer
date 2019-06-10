package com.htf.rabbitmq_customer.controller;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @author ：贺天峰
 * @date ：Created in 2019/6/10 14:44
 * @description：
 * @modified By：修改人
 * @version: $
 */
@Component
@RabbitListener(queues="test" )

public class DirectCustomer1 {
    @RabbitHandler
    public void showMessage(String message){
        System.out.println("Customer1接收到消息："+message);
    }
}
