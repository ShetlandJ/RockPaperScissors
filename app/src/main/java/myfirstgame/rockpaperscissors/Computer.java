package myfirstgame.rockpaperscissors;

/**
 * Created by James on 08/11/2017.
 */

public class Computer {

    String name;
    int computerScore;

    public Computer(String name) {
        this.name = name;
        this.computerScore = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public void increaseComputerScore(int computerScore) {
        this.computerScore += computerScore;
    }
}
