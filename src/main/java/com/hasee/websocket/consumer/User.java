package com.hasee.websocket.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

import com.hasee.websocket.models.OrderStatus;
import com.hasee.websocket.rabbitConfig.MessagingConfig;
import com.hasee.websocket.services.SendService;



@Component
public class User {
	@Autowired
	SendService ser ;
	
	@Autowired
	SimpMessagingTemplate template ;
	

	
    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void consumeMessageFromQueue(OrderStatus msg) {
    	try {
    		//ser.sendData(msg);
    		//ser.sendMessageFromRabbit(msg);
    		
            System.out.println("Message recieved from queue : " + msg);
            this.template.convertAndSend("/topic/data", msg);
            
    	}catch (Exception e) {
			// TODO: handle exception
    		e.printStackTrace();
		}
    	
    }
    
    
    
}
