package xyz.knowdeb.diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = findViewById(R.id.rollBtn);

        final ImageView leftDice = findViewById(R.id.left_dice);
        final ImageView rightDice = findViewById(R.id.right_dice);

        final int[] diceImage = {R.mipmap.dice1,
                R.mipmap.dice2,
                R.mipmap.dice3,
                R.mipmap.dice4,
                R.mipmap.dice5,
                R.mipmap.dice6};

        /* Set an Event Listener ot the Roll Button */
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumber = new Random();

                int number1 = randomNumber.nextInt(6);
                int number2 = randomNumber.nextInt(6);


                Log.d("Random Number: 1", "Number = " + number1);
                Log.d("Random Number: 2", "Number = " + number2);

                leftDice.setImageResource(diceImage[number1]);
                rightDice.setImageResource(diceImage[number2]);

            }
        });


    }
}