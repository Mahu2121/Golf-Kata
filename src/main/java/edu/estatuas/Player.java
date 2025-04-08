package edu.estatuas;

public class Player {

    private final String iniciales;
    private byte handicap = 0;
    private Short score = 0;
    private Short Points

    Player(String iniciales, byte handicap) {
        this.iniciales = iniciales;
        this.handicap = handicap;
    }

    public String getInitials() {
        return iniciales;
    }

    private byte getHandicap() {
        return handicap;
    }

    public void setScore(int) {

    }

    public Short getScore() {

    }

    public void setPoints(int points) {
    }
}
