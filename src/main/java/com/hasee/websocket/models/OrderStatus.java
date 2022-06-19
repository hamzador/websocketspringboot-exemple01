package com.hasee.websocket.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderStatus {

   private Order order;
   private Temperature temperature;
   private NIBP nibp ;
   private Dat dat;
   private Ecg ecg;

}
