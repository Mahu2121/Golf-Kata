package edu.estatuas;

import java.util.ArrayList;

public class Stableford implements GolfPlay{



    @Override
    public void scoring(ScoreCard scoreCard){
        ArrayList<Player> players = scoreCard.getPlayers();
        for (Player player : players) {
            int points = 0;
            if (player != null) {
                byte[] strokes = scoreCard.getPlayerCourse(player);
                for (int i = 0; i < strokes.length; i++) {
                    if (strokes[i] >= scoreCard.getHole(i).getPar() + StablefordSystem.DOUBLE_BOGEY.getStrokes()) {
                        points += StablefordSystem.DOUBLE_BOGEY.getPoints();
                    }
                    if (strokes[i] == scoreCard.getHole(i).getPar() + StablefordSystem.BOGEY.getStrokes()) {
                        points += StablefordSystem.BOGEY.getPoints();
                    }
                    if (strokes[i] ==scoreCard.getHole(i).getPar()){
                        points += StablefordSystem.PAR.getPoints();
                    }
                    if (strokes[i] == scoreCard.getHole(i).getPar() + StablefordSystem.BIRDIE.getStrokes()){
                        points += StablefordSystem.BIRDIE.getPoints();
                    }
                    if (strokes[i] == scoreCard.getHole(i).getPar() + StablefordSystem.EAGLE.getStrokes()){
                        points += StablefordSystem.EAGLE.getPoints();
                    }
                    if (strokes[i] <= scoreCard.getHole(i).getPar() + StablefordSystem.ALBATROSS.getStrokes())
                        points += StablefordSystem.ALBATROSS.getPoints();
                } player.setPoints(points);
            }
        }
    }
}
