package com.example.paperrockscissors;

/**
 * Created by Nick7 on 9/21/2014.
 */
public enum RockPaperScissorsType {
    ROCK("Rock"), PAPER("Paper"), SCISSORS("Scissors");
    private String value;

    RockPaperScissorsType(String value){
        this.value=value;
    }

    public String getValue() {
        return value;
    }
}
