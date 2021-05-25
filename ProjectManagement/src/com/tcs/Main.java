package com.tcs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Project[] projects = new Project[4];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<projects.length; i++){
            projects[i] = new Project(sc.nextInt(), sc.next(), sc.nextDouble(), sc.next(), sc.next(), sc.next());
            sc.nextLine();
        }
        String str = sc.next();
        sc.close();
        int res1 = findProjForGiveTech(projects, str);
        System.out.println(res1);

        Project res2 = getProjWithMaxCost(projects);
        System.out.println(res2.getProjName());

    }
    public static int findProjForGiveTech(Project[] projects, String str){
        int count = 0;
        for(int i = 0; i < projects.length; i++){
            if(projects[i].getTechnology1().equalsIgnoreCase(str) || projects[i].getTechnology2().equalsIgnoreCase(str) || projects[i].getTechnology3().equalsIgnoreCase(str)){
                count++;
            }
        }
        return count;

    }
    public static Project getProjWithMaxCost(Project[] projects){
        double maxcost = projects[0].getCost();
        int temp = 0;
        for(int i = 1; i<projects.length; i++){
            if(projects[i].getCost() > maxcost){
                maxcost = projects[i].getCost();
                temp = i;
            }
        }
        return projects[temp];
    }
}
