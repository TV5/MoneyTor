package pda;

import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import pda.TestGUI;

public class ReplaceColorPopUp extends JFrame {

	private static final int WIDTH = 600;
	private static final int HEIGHT = 350;
	
	private TestGUI test;
	
	public ReplaceColorPopUp(Point location, TestGUI tg) {
		this.test = tg;
		initComponents();
	}

	public void initComponents() {

		JLabel bg = new JLabel(new ImageIcon(getClass().getResource("/pda/res/select_bags/bg.png")));
		bg.setVisible(true);
		bg.setBounds(0, 0, WIDTH, HEIGHT);

		//close
		final ImageIcon closeDefault = new ImageIcon(getClass().getResource("/pda/res/buttons/close.png"));
		final ImageIcon closeHover = new ImageIcon(getClass().getResource("/pda/res/buttons/close_hover.png"));
		final JLabel closeBtn = new JLabel(closeDefault);
		closeBtn.setBounds(500, 20, 60, 60);
		closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				setVisible(false);
				dispose();
			}
			@Override
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				closeBtn.setIcon(closeHover);
			}
			@Override
			public void mouseExited(java.awt.event.MouseEvent evt) {
				closeBtn.setIcon(closeDefault);
			}
		});
		add(closeBtn);

		// yellow
		JLabel yellowBtn = new JLabel(new ImageIcon(getClass().getResource("/pda/res/select_bags/yellow.png")));
		yellowBtn.setVisible(true);
		yellowBtn.setBounds(50, 120, 100, 204);
		yellowBtn.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				System.out.println("Yellow Clicked");

				JOptionPane.showMessageDialog(new JFrame(),
					    "Cannot replace with yellow bag. Please select another option.",
					    "REPLACE WARNING",
					    JOptionPane.WARNING_MESSAGE);
				//close();
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
					    "Cannot replace with purple bag. Please select another option.",
					    "REPLACE WARNING",
					    JOptionPane.WARNING_MESSAGE);
				//close();
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
				test.replaceActual(1);
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
				test.replaceActual(2);
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
				test.replaceActual(3);
				close();
			}
		});
		add(greenBtn);

		add(bg);

		// settings
		getContentPane().setLayout(null);
		setSize(WIDTH, HEIGHT);
		setLocationRelativeTo(null);
		setUndecorated(true);
		setVisible(true);
		setBackground(new Color(0f,0f,0f,0f));

	}
	
	private void close() {
		this.dispose();
	}
	
}
