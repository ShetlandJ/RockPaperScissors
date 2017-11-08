package myfirstgame.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    Player player;
    Computer computer;
    TextView rock;
    TextView paper;
    TextView scissors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
    }

    public void onButtonClicked(View button){
        player = new Player("James");
        computer = new Computer("The House");

        if (button.getId() == R.id.rockBtn){
        player.playerChoice(Throw.ROCK);
        }
        else if (button.getId() == R.id.paperBtn) {
            player.playerChoice(Throw.PAPER);
        }
        else if (button.getId() == R.id.scissorsBtn) {
            player.playerChoice(Throw.SCISSORS);
        }
        Throw getPlayerInput = player.playersThrow();
        int playersScore = player.getPlayerScore();
        int computersScore = computer.getComputerScore();

        Intent i = new Intent(this, ResultsActivity.class);
        i.putExtra("Throw", getPlayerInput.getThrowName().toUpperCase() );
        i.putExtra("playerScore", playersScore);
        i.putExtra("computerScore", computersScore);
        startActivity(i);
    }

}
