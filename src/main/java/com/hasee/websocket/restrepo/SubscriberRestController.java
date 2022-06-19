package com.hasee.websocket.restrepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import com.hasee.websocket.services.SendService;



@RestController
@CrossOrigin("*")
public class SubscriberRestController {
	
	@Autowired
	SendService ser ;

	
	@GetMapping("/topic")    
	public SseEmitter subsribe() {    
		        
		SseEmitter sseEmitter = new SseEmitter(24 * 60 * 60 * 1000l);    
		//ser.addEmitter(sseEmitter);      
		  
		return sseEmitter;    
   }
}

