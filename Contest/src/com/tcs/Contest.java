package com.tcs;

public class Contest {
    int contestId;
    String contestName;
    String contestWinner;
    int points;
    String category;

    String getContestName(){
        return contestName;
    }
    String getContestWinner(){
        return contestWinner;
    }
    int getPoints(){
        return points;
    }
    String getCategory(){
        return category;
    }

    Contest(int contestId, String contestName, String contestWinner, int points, String category){
        this.contestId = contestId;
        this.contestName = contestName;
        this.contestWinner = contestWinner;
        this.points = points;
        this.category = category;

    }


}
