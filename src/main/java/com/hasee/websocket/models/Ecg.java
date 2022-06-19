package com.hasee.websocket.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Ecg {
	
	private int ecg;
	private int resp;
	private int heart;
	
}
