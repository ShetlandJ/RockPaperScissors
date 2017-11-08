package myfirstgame.rockpaperscissors;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by James on 08/11/2017.
 */

public class Game {

    ArrayList<Throw> choices;
    Player player;
    Computer computer;

    public Game() {
        this.choices = new ArrayList<>();
        choices.add(Throw.ROCK);
        choices.add(Throw.SCISSORS);
        choices.add(Throw.PAPER);
        this.player = new Player("James");
        this.computer = new Computer("The House");
    }

    public int getNumberOfChoices() {
        return this.choices.size();
    }


    public Throw getChoiceAtIndex(int index) {
        return this.choices.get(index);
    }

    public int getRandomNumber() {
        Random rand = new Random();
        int listSize = getNumberOfChoices();
        int random = rand.nextInt(listSize);
        return random;
    }

    public Throw computersRandomSelection() {
        int index = getRandomNumber();
        Throw answer = getChoiceAtIndex(index);
        return answer;
    }

    public Player getPlayer() {
        return player;
    }

    public Computer getComputer() {
        return computer;
    }

    public String compareHands(Throw playersChoice) {

        Throw computersChoice = computersRandomSelection();
        if (playersChoice.getThrowName().equals(computersChoice.getThrowName())) {
            return "It's a draw, as both players threw up " + playersChoice.getThrowName();

        } else if (playersChoice.getThrowName().equals("Rock") && computersChoice.getThrowName().equals("Paper")) {
            computer.increaseComputerScore(1);
            return computer.getName() + " beats " + player.getName() + ", as " + computersChoice.getThrowName() + " beats " + playersChoice.getThrowName();


        } else if (playersChoice.getThrowName().equals("Paper") && computersChoice.getThrowName().equals("Rock")) {
            player.increasePlayerScore(1);
            return player.getName() + " beats " + computer.getName() + ", as " + playersChoice.getThrowName() + " beats " + computersChoice.getThrowName();

        } else if (playersChoice.getThrowName().equals("Scissors") && computersChoice.getThrowName().equals("Paper")) {
            player.increasePlayerScore(1);
            return player.getName() + " beats " + computer.getName() + ", as " + playersChoice.getThrowName() + " beats " + computersChoice.getThrowName();

        } else if (playersChoice.getThrowName().equals("Paper") && computersChoice.getThrowName().equals("Scissors")) {
            computer.increaseComputerScore(1);
            return computer.getName() + " beats " + player.getName() + ", as " + computersChoice.getThrowName() + " beats " + playersChoice.getThrowName();

        } else if (playersChoice.getThrowName().equals("Scissors") && computersChoice.getThrowName().equals("Rock")) {
            computer.increaseComputerScore(1);
            return computer.getName() + " beats " + player.getName() + ", as " + computersChoice.getThrowName() + " beats " + playersChoice.getThrowName();

        } else if (playersChoice.getThrowName().equals("Rock") && computersChoice.getThrowName().equals("Scissors")) {
            player.increasePlayerScore(1);
            return player.getName() + " beats " + computer.getName() + ", as " + playersChoice.getThrowName() + " beats " + computersChoice.getThrowName();
        } else {
            return "That's not a valid combination";
        }
    }
}