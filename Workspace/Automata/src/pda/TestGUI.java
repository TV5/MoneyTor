/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pda;

import javax.swing.*;

/**
 *
 * @author Trisha Lim
 */
public class TestGUI extends JFrame {

    int idList[] = new int[] {1,2,3,1};
    Stack stack = new Stack(idList);
    int BAG_QTY = idList.length;
    int WIDTH = 1366;
    int HEIGHT = 768;
    char operation;
    
    public TestGUI() {
        initComponents();
    }
    
    public static void main(String[] args) {
        new TestGUI();
    }
    
    public void initComponents() {        
    	
    	ImageIcon bgImg = new ImageIcon(getClass().getResource("/pda/res/FINAL-BG.png"));
    	JLabel bg = new JLabel(bgImg);
    	bg.setVisible(true);
    	bg.setBounds(0, 0, WIDTH, HEIGHT);
    	
        //stack
        JLabel[] bags = new JLabel[BAG_QTY];
        final JLabel[] bagLabel = new JLabel[BAG_QTY];
        JLabel restockBtn = new JLabel(new ImageIcon());
        JLabel replaceBtn = new JLabel(new ImageIcon());
        
        for(int i=0; i<BAG_QTY; i++) {
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
	                purchase(evt, bag, bagLabel[temp]);
	            }
	        });
        }
        add(bg);
        //settings
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setSize( WIDTH, HEIGHT);
        setVisible(true);
       
    }
    
    private void purchase(java.awt.event.MouseEvent evt, Bag bag, JLabel label) {                                     
        // TODO add your handling code here:
        System.out.println("click" + bag.getColor());
        stack.purchase();
        label.setVisible(false);
    } 

}

