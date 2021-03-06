package com.productions.rk.tickitock;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class HomeScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        // Setting custom font for welcome text
        TextView WelcomeText = (TextView)findViewById(R.id.welcomeId);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/3Dumb.ttf");
        WelcomeText.setTypeface(custom_font);

        //Try Delay and Loading Property for HomeScreen

       // 3s delay no animation
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(HomeScreen.this, OptionScreen.class));
            }
        }, 3000);
    }
}
