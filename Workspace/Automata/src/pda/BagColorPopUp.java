package pda;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BagColorPopUp extends JFrame {
	
	public BagColorPopUp() {
        initComponents();
    }

	public void initComponents() {        
    	
    	//green
    	JLabel greenBtn = new JLabel(new ImageIcon(getClass().getResource("/pda/res/replace.png")));
    	greenBtn.setBounds(20,100,257,149);
    	greenBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	System.out.println("Green Clicked");
            }
        });
    	add(greenBtn);
    	
    	//blue
    	JLabel blueBtn = new JLabel(new ImageIcon(getClass().getResource("/pda/res/restock.png")));
    	blueBtn.setBounds(20,200,258,167);
    	blueBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	System.out.println("Blue Clicked");
            }
        });
    	add(blueBtn);
    	
    	//pink
    	JLabel pinkBtn = new JLabel(new ImageIcon(getClass().getResource("/pda/res/restock.png")));
    	blueBtn.setBounds(40,150,258,167);
    	blueBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	System.out.println("Pink Clicked");
            }
        });
    	add(pinkBtn);
    	
        //settings
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setSize( 400, 400);
        //setUndecorated(true);
        setVisible(true);
       
    }
	
}
