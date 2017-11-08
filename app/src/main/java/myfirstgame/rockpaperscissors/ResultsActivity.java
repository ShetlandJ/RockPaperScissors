package myfirstgame.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {

    TextView result;
    TextView myScore;
    TextView computerScore;

    EditText inputName;

    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results);

        game = new Game();

        result = findViewById(R.id.result);
        myScore = findViewById(R.id.userScore);
        computerScore = findViewById(R.id.cpuScore);

        Intent i = getIntent();
        Bundle extras = i.getExtras();
        String name = extras.getString("inputText");
        game.getPlayer().setName(name);

    }

    public void onButtonClicked(View button){
        if (button.getId() == R.id.rockBtn){
        game.getPlayer().playerChoice(Throw.ROCK);
        }
        else if (button.getId() == R.id.paperBtn) {
            game.getPlayer().playerChoice(Throw.PAPER);
        }
        else if (button.getId() == R.id.scissorsBtn) {
            game.getPlayer().playerChoice(Throw.SCISSORS);
        }
        String resultText = game.compareHands(game.getPlayer().playersThrow());

        result.setText(resultText);
        myScore.setText(String.valueOf(game.getPlayer().getPlayerScore()));
        computerScore.setText(String.valueOf(game.getComputer().getComputerScore()));

    }

    public void onClearButtonClicked(View button){
        game.getPlayer().setPlayerScore(0);
        game.getComputer().setComputerScore(0);
        myScore.setText(String.valueOf(game.getPlayer().getPlayerScore()));
        computerScore.setText(String.valueOf(game.getComputer().getComputerScore()));

    }


}

