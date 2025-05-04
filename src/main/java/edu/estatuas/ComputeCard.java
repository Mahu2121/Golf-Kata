package edu.estatuas;

public class ComputeCard {

    private ScoreCard scoreCard;
    private GolfPlay golfPlay;

    ComputeCard(ScoreCard scoreCard, GolfPlay golfPlay) {
        this.scoreCard = scoreCard;
        this.golfPlay = golfPlay;
    }


    public void compute(){
        this.golfPlay.scoring(scoreCard);
    }
}
