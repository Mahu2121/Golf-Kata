package edu.estatuas;

public enum StablefordSystem {

    DOUBLE_BOGEY(2, -3),
    BOGEY(1, -1),
    PAR(0, 0),
    BIRDIE(-1, 2),
    EAGLE(-2, 5),
    ALBATROSS(-3, 8);

    private final int strokes;
    private final int points;

     StablefordSystem(int strokes, int points) {
        this.strokes = strokes;
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
    public int getStrokes() {
        return strokes;
    }

}
