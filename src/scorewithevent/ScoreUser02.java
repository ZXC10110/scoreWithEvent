/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorewithevent;

/**
 *
 * @author kanya
 */
public class ScoreUser02 implements ScoreListener {

    @Override
    public void update(ScoreEvent e) {
        System.out.println( "[User 02] Live Result : " + e.getScoreData()); 
    }
    
}
