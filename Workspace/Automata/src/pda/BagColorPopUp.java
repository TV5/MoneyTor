package pda;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BagColorPopUp extends JFrame {
	
	private static final int WIDTH = 600;
    private static final int HEIGHT = 350;
	
	public BagColorPopUp() {
        initComponents();
    }

	public void initComponents() {        
		ImageIcon test = new ImageIcon(getClass().getResource("/pda/res/select_bags/bg.png"));
		JLabel bg = new JLabel(test);
    	bg.setVisible(true);
    	bg.setBounds(0, 0, WIDTH, HEIGHT);
    	
    	//yellow
    	JLabel yellowBtn = new JLabel(new ImageIcon(getClass().getResource("/pda/res/select_bags/yellow.png")));
    	yellowBtn.setBounds(10,300,258,167);
    	yellowBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
    		public void mouseClicked(java.awt.event.MouseEvent evt) {
            	System.out.println("Blue Clicked");
            }
        });
    	add(yellowBtn);
    	
    	//purple
    	JLabel purpleBtn = new JLabel(new ImageIcon(getClass().getResource("/pda/res/select_bags/purple.png")));
    	purpleBtn.setBounds(120,300,258,167);
    	purpleBtn.addMouseListener(new java.awt.event.MouseAdapter() {
    		@Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	System.out.println("Pink Clicked");
            }
        });
    	add(purpleBtn);
    	
    	//blue
    	JLabel blueBtn = new JLabel(new ImageIcon(getClass().getResource("/pda/res/select_bags/blue.png")));
    	blueBtn.setBounds(230,300,258,167);
    	blueBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
    		public void mouseClicked(java.awt.event.MouseEvent evt) {
            	System.out.println("Blue Clicked");
            }
        });
    	add(blueBtn);
    	
    	//pink
    	JLabel pinkBtn = new JLabel(new ImageIcon(getClass().getResource("/pda/res/select_bags/pink.png")));
    	blueBtn.setBounds(340,300,258,167);
    	blueBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
    		public void mouseClicked(java.awt.event.MouseEvent evt) {
            	System.out.println("Pink Clicked");
            }
        });
    	add(pinkBtn);
    	
    	//green
    	JLabel greenBtn = new JLabel(new ImageIcon(getClass().getResource("/pda/res/select_bags/green.png")));
    	greenBtn.setBounds(450,300,257,149);
    	greenBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
    		public void mouseClicked(java.awt.event.MouseEvent evt) {
            	System.out.println("Green Clicked");
            }
        });
    	add(greenBtn);
    	
    	add(bg);
    	
        //settings
        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
       // Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
       // this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setSize(WIDTH, HEIGHT);
        setUndecorated(false);
        setVisible(true);
        
       
    }
	
}
