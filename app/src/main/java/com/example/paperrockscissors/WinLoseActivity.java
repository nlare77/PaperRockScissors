package com.example.paperrockscissors;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Nick7 on 9/21/2014.
 */
public class WinLoseActivity extends MyActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win_lose);
        Intent intent = getIntent();
        int clickedType = intent.getIntExtra(RockPaperScissorsUtil.INPUT_TYPE,0);

        RockPaperScissorsType player1Choice = RockPaperScissorsType.ROCK;
        if(clickedType==R.id.imageRock){
            player1Choice=RockPaperScissorsType.ROCK;
        }else if(clickedType==R.id.imagePaper){
            player1Choice=RockPaperScissorsType.PAPER;
        }else if(clickedType==R.id.imageScissors){
            player1Choice=RockPaperScissorsType.SCISSORS;
        }

        RockPaperScissorsAI player2 = new RockPaperScissorsAI();
        RockPaperScissorsType player2Choice = player2.play();

        //set picture
        ImageView imageComputer = (ImageView)findViewById(R.id.imageComputer);
        if(player2Choice==RockPaperScissorsType.ROCK){
            imageComputer.setImageResource(R.drawable.rock);
        }else if(player2Choice==RockPaperScissorsType.PAPER){
            imageComputer.setImageResource(R.drawable.paper);
        }else if(player2Choice==RockPaperScissorsType.SCISSORS){
            imageComputer.setImageResource(R.drawable.scissors);
        }

        //set result
        String result = RockPaperScissorsUtil.eval(player1Choice,player2Choice);
        TextView textView = (TextView)findViewById(R.id.textResult);
        textView.setText(result);

        Button button = (Button) findViewById(R.id.btnAgain);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WinLoseActivity.this.finish();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
