/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorewithevent;

import java.util.ArrayList;

/**
 *
 * @author kanya
 */
public class Source {
    
    private ArrayList<ScoreListener> Listeners; 
    
    public Source(){
        Listeners = new ArrayList<>();
    }
    
    public void setScoreData(String score) {
        notifyAllUser(new ScoreEvent(this, score));
    }
    
    public void addScoreListener(ScoreListener score) {
        Listeners.add(score);
    }
    
    public void removeScoreListener(ScoreListener score) {
        Listeners.remove(score);
    }
    
    public void notifyAllUser(ScoreEvent e) {
        for(int i = 0; i < Listeners.size(); i++) {
	ScoreListener l = Listeners.get(i);
	    l.update(e);
	}
    }
  
}
