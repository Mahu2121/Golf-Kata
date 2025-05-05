package edu.estatuas;

import java.util.ArrayList;
import java.util.List;

public class ScoreCard {
    private Player playerA;
    private Player playerB;
    private Player playerC = null;
    private Player playerD = null;
    private ArrayList<Player> players;
    private Course playersCourse;
    private List<Hole> holes;

    ScoreCard() {
        players = new ArrayList<>();
        holes = new ArrayList<>();
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

    public void addHoles(Byte[] holes) {
        for (int i = 0; i < holes.length; i++) {
            Hole hole = new Hole((byte)(i + 1), holes[i]);
            this.holes.add(hole);
        }
    }

    public int getNumHoles() {
        return holes.size();
    }

    public List<Hole> getHoles() {
        return holes;
    }

    public Hole getHole(int i) {
        return holes.get(i);
    }



}
