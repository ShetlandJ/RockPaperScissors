package myfirstgame.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    Button play;
    EditText inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        play = findViewById(R.id.playGameBtn);
        inputText = findViewById(R.id.nameBox);

    }

    public void onButtonClicked(View button){

        String input = inputText.getText().toString();
        Intent i = new Intent(this, ResultsActivity.class);
        i.putExtra("inputText", input);
        startActivity(i);
    }

}
