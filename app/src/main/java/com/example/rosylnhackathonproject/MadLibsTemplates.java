package com.example.rosylnhackathonproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;


public class MadLibsTemplates extends AppCompatActivity {
    String oneNoun, twoNoun, oneAdjective, twoAdjective, oneVerb, twoVerb;
    private TextView display;
    private EditText nounOne, nounTwo, adjectiveOne, adjectiveTwo, verbOne, verbTwo;
    //private TextView output;
    private Button button;
    private ArrayList<String> template1 = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_libs_templates);

        nounOne = (EditText) findViewById(R.id.Noun1);
        nounTwo = (EditText) findViewById(R.id.Noun2);
        adjectiveOne = (EditText) findViewById(R.id.Adjective1);
        adjectiveTwo = (EditText) findViewById(R.id.Adjective2);
        verbOne = (EditText) findViewById(R.id.Verb1);
        verbTwo = (EditText) findViewById(R.id.Verb2);
        //output = findViewById(R.id.recycler_view);
        button = (Button) findViewById(R.id.Submit);
        display = findViewById(R.id.display);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oneNoun = nounOne.getText().toString();
                twoNoun = nounTwo.getText().toString();
                oneAdjective = adjectiveOne.getText().toString();
                twoAdjective = adjectiveTwo.getText().toString();
                oneVerb = verbOne.getText().toString();
                twoVerb = verbTwo.getText().toString();

                display.setText(createTemplate(template1, oneNoun, twoNoun, oneAdjective, twoAdjective, oneVerb, twoVerb));




            }
        });


    }

    public String createTemplate(ArrayList<String> template, String firstNoun,
                               String secondNoun, String firstAdjective,
                               String secondAdjective, String firstVerb,
                               String secondVerb)
    {//Mystical land one
        template.add("In a mystical land filled with ");
        template.add(firstAdjective);
        template.add(" ");
        template.add(firstNoun);
        template.add(" roam freely. These majestic creatures are known as ");
        template.add(secondNoun);
        template.add(". Legends say that these dragons are as ");
        template.add(secondAdjective);
        template.add(" as they are ");
        template.add(firstAdjective);
        template.add(". \n\n");
        template.add("One day, a brave ");
        template.add(firstNoun);
        template.add(" decided to embark on a quest to discover the secret of the dragons. Armed with a ");
        template.add(secondAdjective);
        template.add(" ");
        template.add(firstNoun);
        template.add(", the adventurer journeyed through ");
        template.add(secondVerb);
        template.add(", where the air was filled with the scent of ");
        template.add(secondNoun);
        template.add(". \n\n");
        template.add("As the hero approached the dragon's lair, a magnificent black dragon emerged. With head held high, the dragon greeted the adventurer with a ");
        template.add(firstVerb);
        template.add("rumble. The hero realized that the dragons were not as ");
        template.add(firstAdjective);
        template.add(" as the stories suggested; instead, they were guardians of ");
        template.add(firstNoun);
        template.add(", protecting the realm from ");
        template.add(secondNoun);
        template.add(". \n\n");
        template.add("In the end, the hero and the dragons became the best of ");
        template.add(secondNoun);
        template.add(", sharing tales of their adventures under the stars. And so, in the land of ");
        template.add(secondVerb);
        template.add(", the bond between humans and dragons flourished, creating a tale as ");
        template.add(secondAdjective);
        template.add(" as the dragons themselves.");
        String returnString = "";
        for(String string:template)
        {
            returnString.concat(string);
        }
        return returnString;




    }

    private void showToast(String text)
    {
        Toast.makeText(MadLibsTemplates.this, text, Toast.LENGTH_SHORT).show();
    }



}