package com.hasee.websocket.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class NIBP {

    private int highPressure;
    private int meanPressure;
    private int lowPressure;
    private int cuffPressure;
    private int status;
}
