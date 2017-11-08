package myfirstgame.rockpaperscissors;

/**
 * Created by James on 08/11/2017.
 */

public class Player {

    String name;
    Throw playersThrow;
    int playerScore;

    public Player(String name) {
        this.name = name;
        this.playerScore = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void playerChoice(Throw theThrow){
        playersThrow = theThrow;
    }

    public Throw playersThrow(){
        return this.playersThrow;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void increasePlayerScore(int playerScore) {
        this.playerScore += playerScore;
    }

    public void setPlayerScore(int playerScore) {
         this.playerScore = playerScore;
    }
}
