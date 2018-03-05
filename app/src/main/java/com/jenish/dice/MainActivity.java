package com.jenish.dice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Created a Button type variable, which is holding button layout element
        Button rollButton  = findViewById(R.id.rollButton);

        // Created an ImageView type variable, which is holding image view layout element
        final ImageView leftDice = findViewById(R.id.leftDice);
        final ImageView rightDice = findViewById(R.id.rightDice);

        final int[] diceArray = {
                R.drawable.ic_dice_2,
                R.drawable.ic_dice,
                R.drawable.ic_dice_3,
                R.drawable.ic_dice_4,
                R.drawable.ic_dice_5,
                R.drawable.ic_dice_6
        };

        // Executes some action (code inside the "onClick" method) once the button is pressed
        rollButton.setOnClickListener(new View.OnClickListener() { //button instance, which overrides onClick method
            @Override
            public void onClick(View v) {

                Random randomNumber = new Random();

                int number = randomNumber.nextInt(6);
                leftDice.setImageResource(diceArray[number]);

                number = randomNumber.nextInt(6);
                rightDice.setImageResource(diceArray[number]);

            }
        });
    }
}

