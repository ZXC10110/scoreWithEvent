/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorewithevent;

import java.util.EventObject;

/**
 *
 * @author kanya
 */
public class ScoreEvent extends EventObject {
    
    private String scoreData;
    
    public ScoreEvent(Object o, String score) {
        super(o);
        scoreData = score;
    }
    
    public String getScoreData(){
        return scoreData;
    }
    
}
