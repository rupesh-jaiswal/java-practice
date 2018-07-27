package com.hackerrank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Checker implements Comparator {
    public int compare(Object o1, Object o2) {
    	Player p1 = (Player)o1;
    	Player p2 = (Player)o2;
        if(p1.score<=p2.score) {
            if(p1.score == p2.score) {
                return p1.name.compareToIgnoreCase(p2.name);
            }else {
            	return 1;
            }
        }else {
        	return -1;
        }
    }
}
class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}
public class ComparatorProblem {

	 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }

}
