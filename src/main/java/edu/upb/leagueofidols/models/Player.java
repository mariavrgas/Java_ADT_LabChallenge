/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.leagueofidols.models;

import java.time.LocalDateTime;
import lombok.Data;

/**
 *
 * @author cahucadi
 * Data anotattion allows to create getters and setters
 */
@Data
public class Player implements  Comparable<Player>{
    
    private String playerName;
    private int ranking;
    private LocalDateTime created;

    public Player(String playerName, int ranking, LocalDateTime created) {
        this.playerName = playerName;
        this.ranking = ranking;
        this.created = created;
    }
    
    @Override
    public int compareTo(Player o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
