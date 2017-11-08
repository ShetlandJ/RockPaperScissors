package myfirstgame.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {

    TextView result;
    TextView playerScore;
    TextView gameScore;

    Game game;
    Player player;
    Computer computer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results);

        result = findViewById(R.id.result);
        playerScore = findViewById(R.id.playerScoreView);
        gameScore = findViewById(R.id.cpuScoreView);

        game = new Game();


        Intent i = getIntent();

        Bundle extras = i.getExtras();
        String win = extras.getString("Throw");
        int pScore = extras.getInt("playerScore");
        int cScore = extras.getInt("computerScore");

        game.getPlayer().increasePlayerScore(pScore);
        game.getComputer().increaseComputerScore(cScore);

        result.setText(game.compareHands(Throw.valueOf(win)));

        playerScore.setText(String.valueOf(game.getPlayer().getPlayerScore()));
        gameScore.setText(String.valueOf(game.getComputer().getComputerScore()));

    }



}

