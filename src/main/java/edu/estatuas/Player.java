package edu.estatuas;

public class Player {

    private final String iniciales;
    private byte handicap = 0;
    private Short score = 0;
    private Short points = 0;

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

    public void setScore(int score) {
        this.score = (short) score;
    }

    public Short getScore() {
        return score;
    }

    public void setPoints(int points) {
        this.points = (short) points;
    }

    public Short getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return getInitials() + " ---> H'cap: " + getHandicap() + "\t" + " Strokes: " + getScore() + "\t" + " Stableford points: " + getPoints();
    }
}
