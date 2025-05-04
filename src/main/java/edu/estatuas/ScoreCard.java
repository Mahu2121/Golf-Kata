package edu.estatuas;

import java.util.ArrayList;

public class ScoreCard {
    private Player playerA;
    private Player playerB;
    private Player playerC = null;
    private Player playerD = null;
    private ArrayList<Player> players;
    private Course playersCourse;

    ScoreCard() {
        players = new ArrayList<>();
        players.add(playerC);
        players.add(playerD);
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayerA(Player playerA) {
        this.playerA = playerA;
        players.add(playerA);
    }

    public void setPlayerB(Player playerB) {
        this.playerB = playerB;
        players.add(playerB);
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
