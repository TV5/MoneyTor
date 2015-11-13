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
        for(int i=0; i<idList.length; i++){
        	stack.add(new Bag(idList[i],i));
        }
        printStack();
    }
    
    public int restock(int id) {
        if(isValid(id)){
        	int index = stack.size();
            Bag bag = new Bag(id,index);
            stack.add(bag);
            printStack();
            return index;
        }
        return -1;
    }
    
    public void purchase() {
        stack.remove(stack.size()-1);
        printStack();
    }
    
    public int replace(int id) {
        if(isValid(id)){
        	int index = stack.size()-1;
        	Bag bag = new Bag(id, index);
            stack.set(index, bag);
            printStack();
            return index;
        }
        return -1;
    }
    
    public boolean isValid (int id) {
        return (id <= 3);
    }
    
    public void printStack() {
    	for(int i=(stack.size()-1); i>=0; i--){
        	Bag bag = stack.get(i);
        	System.out.print(bag.index + " " + bag.color + " -> ");
        }
    }
    
}
