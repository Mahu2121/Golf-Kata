package edu.estatuas;

import java.util.ArrayList;

public class StrokePlay implements GolfPlay {


    @Override
    public void scoring(ScoreCard scoreCard){
        ArrayList<Player> players = scoreCard.getPlayers();
        for (Player player : players) {
            int points = 0;
            if (player != null) {
                byte[] strokes = scoreCard.getPlayerCourse(player);
                for (int i = 0; i < strokes.length; i++) {
                    points += strokes[i];
                }
                player.setScore(points);
            }
        }
    }

}
