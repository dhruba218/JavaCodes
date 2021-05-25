package com.tcs;
import java.util.*;
public class Main {

        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            int n=in.nextInt();
            Player[] p = new Player[n];
            for(int i=0;i<p.length;i++)
            {
                int id = in.nextInt();
                int matchesPlay = in.nextInt();
                int totalRun = in.nextInt();in.nextLine();
                String name = in.nextLine();
                String team = in.nextLine();
                p[i] = new Player(id, matchesPlay, totalRun, name, team);
            }
            double r = findAverageTotalRunsOfPlayer(p);
            if(r == 0){System.out.println("No Player found with mentioned attribute.");}
            else{
                System.out.println("Average of totalRuns "+r);
            }
            Player pr = findPlayerWithMaximumMatchesPlayed(p);
            if(pr == null){System.out.println("No Player found with mentioned attribute.");}
            else{
                System.out.println("id-"+pr.getId());
                System.out.println("matchesPlayed-"+pr.getMatchPlay());
                System.out.println("totalRuns-"+pr.getTotalRun());
                System.out.println("name-"+pr.getName());
                System.out.println("team-"+pr.getTeam());
            }
            in.close();
        }
        public static double findAverageTotalRunsOfPlayer(Player[] p){
            int sum = 0;
            int count = 0;
            for(int i = 0; i<p.length; i++) {
                sum += p[i].getTotalRun();
                count++;
            }
            double avg = sum/count;
            return avg;
        }
        public static Player findPlayerWithMaximumMatchesPlayed(Player[] player)
        {
            //method logic
            int min = 1000;
            for(int i = 0; i<player.length; i++) {
                if (player[i].getMatchPlay() < min) {
                    min = player[i].getMatchPlay();
                    return player[i];
                }
            }
            return null;
        }


}
