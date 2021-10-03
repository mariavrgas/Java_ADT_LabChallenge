/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.leagueofidols;

import edu.upb.leagueofidols.models.Player;
import edu.upb.leagueofidols.adt.custom.TierCollection;
import edu.upb.leagueofidols.models.TierLevel;

/**
 *
 * @author cahuc
 */
public class League implements ILeague{

    private TierCollection tiers;

    public League(){
        
    }

    @Override
    public void addPlayerToTier(TierLevel level, Player p) {

    }

    @Override
    public boolean isPlayerInTier(TierLevel level, String userName) {
        return false;
    }

    @Override
    public Player findPlayerInTier(TierLevel level, String userName) {
        return null;
    }

    @Override
    public boolean isPlayerInAnyTier(String userName) {
        return false;
    }

    @Override
    public Player findPlayerInAnyTier(String userName) {
        return null;
    }

    @Override
    public TierLevel getPlayerTier(String username) {
        return null;
    }

    @Override
    public void removeFromTier(TierLevel level, Player p) {

    }

    @Override
    public void printTierPlayers(TierLevel level) {

    }

    @Override
    public void printAllPlayers() {

    }
}
