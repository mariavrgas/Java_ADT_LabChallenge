/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.leagueofidols.adt.tree;

import edu.upb.leagueofidols.models.Player;

/**
 *
 * @author cahuc
 */
public class PlayerTree implements ITree<Player>{

    private TreeNode<Player> root = null;

    @Override
    public void add(Player object) {
        root = addRecursive(object, root);
    }
    
    public TreeNode<Player> addRecursive(Player object, TreeNode<Player> current){
        
        if (current == null){
            return new TreeNode<>(object);
        }
        
        //    POSIBLE ERROR AQUÍ
        int val = object.compareTo(current.getValue());
        
        /*
        if (val == -1){
        current.setLeft(addRecursive(object, current.getLeft()));
        } else if (val == 0){
        current.setRight(addRecursive(object, current.getRight()));
        } else {
        System.out.println("¡El valor ya existe!");
        return current;
        }
         */
        switch (val) {
            case -1 -> current.setLeft(addRecursive(object, current.getLeft()));
            case 0 -> current.setRight(addRecursive(object, current.getRight()));
            default -> {
                System.out.println("¡El valor ya existe!");
                return current;
            }
        }
        
        return current;
        
    }
    

    @Override
    public void find(Player object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(Player object) {
        return containsRecursive(object, root);
    }
    
    
    public boolean containsRecursive(Player object, TreeNode<Player> current){
        
        if(current == null){
            return false;
        } else if (current.getValue() == object){
            return true;
        }
        
        int val = object.compareTo(current.getValue());
        
        if (val == -1){
            return containsRecursive(object, current.getLeft());
        } else{
            return containsRecursive(object, current.getRight());
        }
    }
    
    

    @Override
    public void delete(Player object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void traverse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
