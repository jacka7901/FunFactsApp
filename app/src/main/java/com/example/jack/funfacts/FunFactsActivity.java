package com.example.jack.funfacts;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;




import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    // declare our View variables
    private TextView mFactTextView;
    private Button mShowFactButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign the views form the layout file to the corresponding variables.
        mFactTextView = (TextView) findViewById(R.id.FactTextView);
        mShowFactButton = (Button) findViewById(R.id.ShowFactButton);

        View.OnClickListener Listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] facts = {
                        "Ants stretch when they wake up in the morning.",
                        "Ostriches can run faster than horses.",
                        "Olympic gold medals are actually made mostly of silver.",
                        "You are born with 300 bones; by the time you are an adult you will have 206.",
                        "It takes about 8 minutes for light from the Sun to reach Earth.",
                        "Some bamboo plants can grow almost a meter in just one day.",
                        "The state of Florida is bigger than England.",
                        "Some penguins can leap 2-3 meters out of the water.",
                        "On average, it takes 66 days to form a new habit.",
                        "Mammoths still walked the earth when the Great Pyramid was being built."


                };

                // the button was clicked,so update the fact TextView with a new fact.
                String fact = "";
                // Randomly Select a fact.
                Random randomGenerator = new Random();


                int randomNumber = randomGenerator.nextInt(facts.length);
                fact = facts[randomNumber];
                //update the screen with our dynamic fact.
                mFactTextView.setText(fact);


            }
        };


        mShowFactButton.setOnClickListener(Listener);


    }
}
