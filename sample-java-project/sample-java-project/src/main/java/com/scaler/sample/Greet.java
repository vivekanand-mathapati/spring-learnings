package com.scaler.sample;

import java.util.Calendar;

public class Greet {
    public  static final String GREET_MORN = "GOOD MORNING";
    public  static final String GREET_AFT = "GOOD Afternoon";
    public  static final String GREET_EVE = "GOOD Evening";

    public static String fetchGreetings(){
        int hotd = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

        if(hotd < 12){
            return GREET_MORN;
        } else if (hotd > 12 && hotd < 4) {
            return GREET_AFT;
        }else {
            return GREET_EVE;
        }
    }
}
