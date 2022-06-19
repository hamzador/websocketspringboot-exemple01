package com.hasee.websocket.services;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Service;
@Service
public class SendService {
	
//	
//	List<SseEmitter> emitters = new ArrayList<>();       
//	public void addEmitter(SseEmitter emitter) {
//		
//		emitter.onCompletion(() -> {
//			synchronized (emitter) {
//				emitters.remove(emitter);
//			}
//			
//		}
//		
//		);   
//		emitter.onTimeout(() -> emitters.remove(emitter));    
//		emitters.add(emitter);  
//		}
//	
//	
//	public void sendData(Object orderStatus) {
//		try {
//			List<SseEmitter> deadEmitters = new ArrayList<>();        
//		       
//			emitters.forEach(emitter -> {  
//				try {   
//					emitter.send(SseEmitter    .event().name("listenSpo2")    .data(orderStatus)); 
//					}
//		
//		catch (IOException e) {    
//			deadEmitters.add(emitter); 
//			}    
//			});      
//			emitters.removeAll(deadEmitters);   
//		
//		}catch(Exception e) {
////			e.printStackTrace();
//		}
//	
//		}
	  //private final SimpMessagingTemplate template = null;
  	@Autowired    
    private SimpMessageSendingOperations messagingTemplate;
	  
//
//	    @MessageMapping("/send/message")
//	    public void sendMessage(String message){
//	        System.out.println(message);
//	        this.template.convertAndSend("/message",  message);
//	    }

//	    @MessageMapping("/send/passport")
//	    public void sendPassport( Passport passport){
//	        System.out.println(passport);
//	        this.template.convertAndSend("/passport",  passport);
//	    }
//	    
	    
	   // @MessageMapping("/send/message")
//	    public void sendMessageFromRabbit( OrderStatus orderStatus){
//	        System.out.println("this is the queue Data : "+ orderStatus);
//	        this.messagingTemplate.convertAndSend("/topic/data",  "{'ff':'tt'}");
//	    }
//	
}
