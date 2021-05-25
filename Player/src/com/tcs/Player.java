package com.tcs;

public class Player {


        int id;
        int matchesPlay;
        int totalRun;
        String name;
        String team;
        public Player(int id, int matchesPlay, int totalRun, String name, String team) {
            super();
            this.id = id;
            this.matchesPlay = matchesPlay;
            this.totalRun = totalRun;
            this.name = name;
            this.team = team;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getTeam() {
            return team;
        }
        public void setTeam(String team) {
            this.team = team;
        }
        public int getMatchPlay() {
            return matchesPlay;
        }
        public void setMatchPlay(int matchesPlay) {
            this.matchesPlay = matchesPlay;
        }
        public int getTotalRun() {
            return totalRun;
        }
        public void setTotalRun(int totalRun) {
            this.totalRun = totalRun;
        }
    }




