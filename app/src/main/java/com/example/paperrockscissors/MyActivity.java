package com.example.paperrockscissors;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import com.example.paperrockscissors.PRSFactory;
import com.example.paperrockscissors.AllThree;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        Button btn = (Button) findViewById(R.id.btnFinder);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AllThree allThree = PRSFactory.getInstance();
                Toast toast = Toast.makeText(view.getContext(),allThree.powerCheer(),Toast.LENGTH_LONG);
                toast.show();
                ImageView imageView = (ImageView) findViewById(R.id.imgView);
                imageView.setImageResource(allThree.showPRSImage());
    }});



}
}