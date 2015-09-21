/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pda;


import java.awt.event.MouseEvent;

import javax.swing.*;

/**
 *
 * @author Trisha Lim
 */
public class TestGUI extends JFrame {
    
    public TestGUI() {
        initComponents();
    }
    
    public static void main(String[] args) {
        new TestGUI();
    }
    
    public void initComponents() {        
        //stack
        int idList[];
        idList = new int[] {1,2,3,1};
        Stack stack = new Stack(idList);
        JLabel[] bags = new JLabel[4];
        final JLabel[] bagLabel = new JLabel[4];
        
        for(int i=0; i<4; i++) {
        	
        	final Bag bag = stack.stack.get(i);
            bags[i] = new JLabel(bag.getImage());
            bags[i].setBounds(50*(i+2), 100-((i+2)*20), 400, 400);
            bags[i].setVisible(true);
            bags[i].setName(bag.getColor());
            add(bags[i]);
            bagLabel[i]=bags[i];
            
            final int temp=i;
            System.out.println("color: " + bag.getColor() +bags[i].toString());
	        bags[i].addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                bagMouseClicked(evt, bag, bagLabel[temp]);
	            }
	        });

        }

        
        //settings
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setSize(1000,700);
        setVisible(true);
       
    }
    
    private void bagMouseClicked(java.awt.event.MouseEvent evt, Bag bag, JLabel label) {                                     
        // TODO add your handling code here:
        System.out.println("click" + bag.getColor());
        label.setVisible(false);
    } 

}
