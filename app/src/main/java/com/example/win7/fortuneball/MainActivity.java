package com.example.win7.fortuneball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Random;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {

    String fortuneList[] = {"Don’t count on it", "Ask again later", "You may rely on it", "Without a doubt", "Outlook not so good", "It's decidedly so", "Signs point to yes", "Yes definitely", "Yes", "My sources say NO"};
    TextView mFortuneText;
    Button mGenerateFortuneButton;
    ImageView mFortuneBallImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
// 2:
        setContentView(R.layout.activity_main);


// 3:
        mFortuneText = (TextView) findViewById(R.id.fortuneText);
        mFortuneBallImage = (ImageView) findViewById(R.id.fortunateImage);
        mGenerateFortuneButton = (Button) findViewById(R.id.fortuneButton);

// 4:
        mGenerateFortuneButton.setOnClickListener(new View.OnClickListener() {
                                                      @Override
                                                      public void onClick(View view) {
                                                          // 5:
                                                          int index = new Random().nextInt(fortuneList.length);
                                                          mFortuneText.setText(fortuneList[index]);
                                                          // 6:
                                                          YoYo.with(Techniques.Swing)
                                                                  .duration(500)
                                                                  .playOn(mFortuneBallImage);
                                                      }
                                                  }
        );
    }
};