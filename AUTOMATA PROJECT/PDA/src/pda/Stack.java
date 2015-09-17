/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pda;

import java.util.ArrayList;

/**
 *
 * @author Trisha Lim
 */
public class Stack {
    
    ArrayList<Bag> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }
    
    public Stack(int[] idList) {
        this.stack = new ArrayList<>();
        for (int id : idList) {
            stack.add(new Bag(id));
        }
    }
    
    public void restock(int id) {
        if(isValid(id)){
            Bag bag = new Bag(id);
            stack.add(bag);
        }
    }
    
    public void purchase() {
        stack.remove(0);
    }
    
    public void replace(int id) {
        if(isValid(id)){
            Bag bag = new Bag(id);
            stack.set(0, bag);
        }
    }
    
    public boolean isValid (int id) {
        return (id <= 3);
    }
    
}
