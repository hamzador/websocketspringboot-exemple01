package com.hasee.websocket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Controller;

import com.hasee.websocket.models.OrderStatus;

@Controller
public class WebSocketController {

    
    @Autowired    
    private SimpMessageSendingOperations messagingTemplate;
    
//   
//    @Autowired
//    WebSocketController(SimpMessagingTemplate template){
//        this.template = template;
//    }
//
//    @MessageMapping("/send/message")
//    public void sendMessage(OrderStatus message){
//        System.out.println("this is the queue message"+message);
//        this.template.convertAndSend("/message",  message);
//    }
//
//    @MessageMapping("/send/passport")
//    public void sendPassport( Passport passport){
//        System.out.println(passport);
//        this.template.convertAndSend("/passport",  passport);
//    }
//    
//    
    @MessageMapping("/topic/data")
    public void sendMessageFromRabbit( OrderStatus orderStatus){
        System.out.println(": "+orderStatus);
        this.messagingTemplate.convertAndSend("/topic",  orderStatus);
       
    }
    
    
   
}