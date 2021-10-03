/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.leagueofidols.adt.custom;

import edu.upb.leagueofidols.adt.custom.CustomEntry;
import edu.upb.leagueofidols.adt.tree.ITree;
import edu.upb.leagueofidols.adt.custom.ICustomCollection;
import edu.upb.leagueofidols.adt.tree.PlayerTree;
import edu.upb.leagueofidols.models.Player;
import edu.upb.leagueofidols.models.TierLevel;

import java.nio.file.Path;

/**
 *
 * @author cahuc
 */
public class TierCollection implements ICustomCollection<TierLevel, Player>{

    private CustomEntry<TierLevel, PlayerTree> entry;

    @Override
    public void put(TierLevel key, Player value) {

    }

    @Override
    public Player findInKey(TierLevel key, Player value) {
        return null;
    }

    @Override
    public Player findInAnyKey(Player value) {
        return null;
    }

    @Override
    public TierLevel findKey(Player value) {
        return null;
    }

    @Override
    public boolean existInKey(TierLevel key, Player value) {
        return false;
    }

    @Override
    public boolean existInAnyKey(Player value) {
        return false;
    }

    @Override
    public void printByKey(TierLevel key) {

    }

    @Override
    public void printAll() {

    }
}
