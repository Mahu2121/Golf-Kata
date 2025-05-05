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
                for (byte stroke : strokes) {
                    if (stroke == StablefordSystem.DOUBLE_BOGEY.getStrokes()) {
                        points += StablefordSystem.DOUBLE_BOGEY.getPoints();
                    }
                    if (stroke == StablefordSystem.BOGEY.getStrokes()){
                        points += StablefordSystem.BOGEY.getPoints();
                    }
                    if (stroke == StablefordSystem.PAR.getStrokes()){
                        points += StablefordSystem.PAR.getPoints();
                    }
                    if (stroke == StablefordSystem.BIRDIE.getStrokes()){
                        points += StablefordSystem.BIRDIE.getPoints();
                    }
                    if (stroke == StablefordSystem.EAGLE.getStrokes()){
                        points += StablefordSystem.EAGLE.getPoints();
                    }
                    if (stroke == StablefordSystem.ALBATROSS.getStrokes())
                        points += StablefordSystem.ALBATROSS.getPoints();
                } player.setPoints(points);
            }
        }
    }
}
