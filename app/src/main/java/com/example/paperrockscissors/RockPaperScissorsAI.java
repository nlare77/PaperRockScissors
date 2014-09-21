package com.example.paperrockscissors;

import java.util.Date;
import java.util.Random;

/**
 * Created by Nick7 on 9/21/2014.
 */
public class RockPaperScissorsAI {
    private static int counter=0;
    public RockPaperScissorsType play(){
        Random random = new Random(new Date().getTime() + counter++);
        int randomNumber = random.nextInt(3);
        switch(randomNumber){
            case 0 : return RockPaperScissorsType.ROCK;
            case 1 : return RockPaperScissorsType.PAPER;
            default : return RockPaperScissorsType.SCISSORS;
        }
    }
}
