package com.example.paperrockscissors;
import android.util.Log;

import com.example.paperrockscissors.Paper;
import com.example.paperrockscissors.Rock;
import com.example.paperrockscissors.Scissors;

import java.util.Date;
import java.util.Random;
/**
 * Created by Nick7 on 9/14/2014.
 */
public class PRSFactory {
    private static int number = 1;
    private PRSFactory(){}
    public static AllThree getInstance() {
        Random randomGenerator = new Random(new Date().getTime() + number++);
        int val = randomGenerator.nextInt(4);//up to four but not including
        Log.d("PBS", "image number: " + val);
        switch (val) {
            case 1:
                return new Rock();
            case 2:
                return new Paper();
            default:
                return new Scissors();
        }
    }
}
