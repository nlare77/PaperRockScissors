package com.example.paperrockscissors;

/**
 * Created by Nick7 on 9/21/2014.
 */
public class RockPaperScissorsUtil {
    public static final String INPUT_TYPE = "com.wesleyreisz.rockpaperscissors.inputType";

    public static String eval(RockPaperScissorsType player1Choice, RockPaperScissorsType player2Choice){
        if(player1Choice==player2Choice){
            return "Tie";
        }else{
            if (player1Choice==RockPaperScissorsType.ROCK){ //rock beats scissors
                if(player2Choice==RockPaperScissorsType.SCISSORS){
                    return "Player 1 Wins";
                }else{
                    return "Computer Wins";
                }
            }else if (player1Choice==RockPaperScissorsType.SCISSORS){//scissors beats paper
                if(player2Choice==RockPaperScissorsType.PAPER){
                    return "Player 1 Wins";
                }else{
                    return "Computer Wins";
                }
            }else{//paper
                if(player2Choice==RockPaperScissorsType.ROCK){//paper beats rock
                    return "Player 1 Wins";
                }else{
                    return "Computer Wins";
                }
            }
        }
    }
}
