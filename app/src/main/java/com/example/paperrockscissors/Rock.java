package com.example.paperrockscissors;
import android.graphics.Bitmap;
/**
 * Created by Nick7 on 9/14/2014.
 */
public class Rock implements AllThree {
    @Override
    public int showPRSImage () {return R.drawable.rock;}

    @Override
    public String powerCheer() {return "Rock";}
}
