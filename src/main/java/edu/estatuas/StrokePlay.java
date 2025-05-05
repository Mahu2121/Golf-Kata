package edu.estatuas;

import java.util.ArrayList;

public class StrokePlay implements GolfPlay {


    @Override
    public void scoring(ScoreCard scoreCard){
        ArrayList<Player> players = scoreCard.getPlayers();
        for (Player player : players) {
            int total = 0;
            if (player != null) {
                byte[] strokes = scoreCard.getPlayerCourse(player);
                for (byte stroke : strokes) {
                    total += stroke;
                }
                player.setScore(total);
            }
        }
    }

}
