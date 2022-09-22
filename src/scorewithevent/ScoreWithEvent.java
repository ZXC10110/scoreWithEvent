/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorewithevent;

import java.util.Scanner;

/**
 *
 * @author kanya
 */
public class ScoreWithEvent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Source source = new Source();
        ScoreUser01 user01 = new ScoreUser01();
        ScoreUser02 user02 = new ScoreUser02();
        
        //register
        source.addScoreListener(user01);
        source.addScoreListener(user02);
        
        //update        
        boolean enter = true;
        Scanner sc = new Scanner(System.in);
        while (enter){
            System.out.print("ENTER SCORE : ");
            String score = sc.nextLine();
            if (score.equals("")) {
                enter = false;
                source.setScoreData("End Match");
            } else {
                source.setScoreData(score);
            }
        }
    }
    
}
