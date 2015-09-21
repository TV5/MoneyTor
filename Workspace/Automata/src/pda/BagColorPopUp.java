package pda;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BagColorPopUp extends JFrame {
	
	public BagColorPopUp() {
        initComponents();
    }

	public void initComponents() {        
    	
    	//replace
    	JLabel replaceBtn = new JLabel(new ImageIcon(getClass().getResource("/pda/res/replace.png")));
    	replaceBtn.setBounds(350,170,257,149);
    	replaceBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	System.out.println("Green Clicked");
            }
        });
    	add(replaceBtn);
    	
    	//restock
    	JLabel restockBtn = new JLabel(new ImageIcon(getClass().getResource("/pda/res/restock.png")));
    	restockBtn.setBounds(60,200,258,167);
    	restockBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	System.out.println("restock");
            }
        });
    	add(restockBtn);
    	
        //settings
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setSize( 400, 400);
        //setUndecorated(true);
        setVisible(true);
       
    }
	
}
