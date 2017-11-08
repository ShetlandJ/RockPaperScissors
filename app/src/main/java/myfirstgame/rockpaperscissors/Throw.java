package myfirstgame.rockpaperscissors;

/**
 * Created by James on 08/11/2017.
 */

public enum Throw {

    ROCK("Rock", 1),
    SCISSORS("Scissors", 2),
    PAPER("Paper", 0);

    private String throwName;
    private int indexNumber;

    Throw(String throwName, int indexNumber) {
        this.throwName = throwName;
        this.indexNumber = indexNumber;
    }

    public String getThrowName() {
        return throwName;
    }

    public int getIndexNumber() {
        return indexNumber;
    }
}




