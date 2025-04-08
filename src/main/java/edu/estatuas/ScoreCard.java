package edu.estatuas;

public class ScoreCard {
    private Player playerA;
    private Player playerB;
    private Player playerC;
    private Player playerD;
    private Course playersCourse;

    ScoreCard() {

    }

    public void setPlayerA(Player playerA) {
        this.playerA = playerA;
    }

    public void setPlayerB(Player playerB) {
        this.playerB = playerB;
    }

    public void setPlayerC(Player playerC) {
        this.playerC = playerC;
    }

    public void setPlayerD(Player playerD) {
    this.playerD = playerD;
    }

    public void setPlayersCourse(Course playersCourse) {
        this.playersCourse = playersCourse;
    }

    public byte[] getPlayerCourse(Player player) {
        return playersCourse.getPlayerCourse(player);
    }

}
