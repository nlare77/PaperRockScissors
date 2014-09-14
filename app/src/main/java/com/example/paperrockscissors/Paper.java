package com.example.paperrockscissors;
import android.graphics.Bitmap;
/**
 * Created by Nick7 on 9/14/2014.
 */
public class Paper implements AllThree{
@Override
    public int showPRSImage() {
        return R.drawable.paper;
    }

    @Override
    public String powerCheer() {
        return "Paper";
    }
}
