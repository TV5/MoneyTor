package pda;

import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BagColorPopUp extends JFrame {

	private static final int WIDTH = 600;
	private static final int HEIGHT = 350;
	
	private TestGUI test;
	
	public BagColorPopUp(Point location, TestGUI tg) {
		setLocation(location);
		this.test = tg;
		initComponents();
	}

	public void initComponents() {

		JLabel bg = new JLabel(new ImageIcon(getClass().getResource("/pda/res/select_bags/bg.png")));
		bg.setVisible(true);
		bg.setBounds(0, 0, WIDTH, HEIGHT);

		// yellow
		JLabel yellowBtn = new JLabel(new ImageIcon(getClass().getResource("/pda/res/select_bags/yellow.png")));
		yellowBtn.setVisible(true);
		yellowBtn.setBounds(50, 120, 100, 204);
		yellowBtn.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				System.out.println("Yellow Clicked");
				JOptionPane.showMessageDialog(new JFrame(),
					    "Cannot Restock with Yellow Bag",
					    "RESTOCK WARNING",
					    JOptionPane.WARNING_MESSAGE);
				close();
			}
		});
		add(yellowBtn);

		// purple
		JLabel purpleBtn = new JLabel(new ImageIcon(getClass().getResource("/pda/res/select_bags/purple.png")));
		purpleBtn.setVisible(true);
		purpleBtn.setBounds(150, 120, 100, 204);
		purpleBtn.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				System.out.println("Purple Clicked");
				JOptionPane.showMessageDialog(new JFrame(),
					    "Cannot Restock with Purple Bag",
					    "RESTOCK WARNING",
					    JOptionPane.WARNING_MESSAGE);
				close();
			}
		});
		add(purpleBtn);

		// blue
		JLabel blueBtn = new JLabel(new ImageIcon(getClass().getResource("/pda/res/select_bags/blue.png")));
		blueBtn.setVisible(true);
		blueBtn.setBounds(250, 120, 100, 204);
		blueBtn.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				System.out.println("Blue Clicked");
				test.restockActual(1);
				close();
			}
		});
		add(blueBtn);

		// pink
		JLabel pinkBtn = new JLabel(new ImageIcon(getClass().getResource("/pda/res/select_bags/pink.png")));
		pinkBtn.setVisible(true);
		pinkBtn.setBounds(350, 120, 100, 204);
		pinkBtn.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				System.out.println("Pink Clicked");
				test.restockActual(2);
				close();
			}
		});
		add(pinkBtn);

		// green
		JLabel greenBtn = new JLabel(new ImageIcon(getClass().getResource("/pda/res/select_bags/green.png")));
		greenBtn.setVisible(true);
		greenBtn.setBounds(450, 120, 100, 204);
		greenBtn.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				System.out.println("Green Clicked");
				test.restockActual(3);
				close();
			}
		});
		add(greenBtn);

		add(bg);

		// settings
		// setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		// Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		// this.setLocation(dim.width/2-this.getSize().width/2,
		// dim.height/2-this.getSize().height/2);
		setSize(WIDTH, HEIGHT + 20);
		setUndecorated(false);
		setVisible(true);

	}
	
	private void close() {
		this.dispose();
	}
	
}
