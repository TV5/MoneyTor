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

	int idList[] = new int[] { 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3 };
	Stack stack = new Stack(idList);
	int BAG_QTY = idList.length;
	int WIDTH = 1366;
	int HEIGHT = 768;
	char operation;
	JLabel[] bags = new JLabel[BAG_QTY];
	final JLabel[] bagLabel = new JLabel[BAG_QTY];

	// images

	public TestGUI() {
		initComponents();
	}

	public static void main(String[] args) {
		new TestGUI();
	}

	public void initComponents() {
		// background image
		JLabel bg = new JLabel(new ImageIcon(getClass().getResource("/pda/res/bg.png")));
		bg.setVisible(true);
		bg.setBounds(0, 0, WIDTH, HEIGHT);

		// replace
		final ImageIcon replaceDefault = new ImageIcon(getClass().getResource("/pda/res/buttons/replace.png"));
		final ImageIcon replaceHover = new ImageIcon(getClass().getResource("/pda/res/buttons/replace_hover.png"));
		final JLabel replaceBtn = new JLabel(replaceDefault);
		replaceBtn.setBounds(369, 136, 257, 149);
		
		replaceBtn.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				System.out.println("mouse clicked");
				replace(evt, 1);
			}
			@Override
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				replaceBtn.setIcon(replaceHover);
			}
			@Override
			public void mouseExited(java.awt.event.MouseEvent evt) {
				replaceBtn.setIcon(replaceDefault);
			}
		});
		add(replaceBtn);

		// restock
		final ImageIcon restockDefault = new ImageIcon(getClass().getResource("/pda/res/buttons/restock.png"));
		final ImageIcon restockHover = new ImageIcon(getClass().getResource("/pda/res/buttons/restock_hover.png"));
		final JLabel restockBtn = new JLabel(restockDefault);
		restockBtn.setBounds(70, 139, 258, 167);
		restockBtn.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				System.out.println("restock");
				restock(evt, 1);
			}
			@Override
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				restockBtn.setIcon(restockHover);
			}
			@Override
			public void mouseExited(java.awt.event.MouseEvent evt) {
				restockBtn.setIcon(restockDefault);
			}
		});
		add(restockBtn);

		// close
		final ImageIcon closeDefault = new ImageIcon(getClass().getResource("/pda/res/buttons/close.png"));
		final ImageIcon closeHover = new ImageIcon(getClass().getResource("/pda/res/buttons/close_hover.png"));
		final JLabel closeBtn = new JLabel(closeDefault);
		closeBtn.setBounds(1280, 20, 60, 60);
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

		// stack
		for (int i = 0; i < BAG_QTY; i++) {
			final Bag bag = stack.stack.get(i);
			bags[i] = new JLabel(bag.getImage());
			bags[i].setBounds(850 - (i * 70), 401, 400, 400);
			bags[i].setVisible(true);
			bags[i].setName(bag.getColor());
			// add(bags[i]);
			bagLabel[i] = bags[i];

			final int temp = i;
			// System.out.println("color: " + bag.getColor()
			// +bags[i].toString());
			bags[i].addMouseListener(new java.awt.event.MouseAdapter() {
				@Override
				public void mouseClicked(java.awt.event.MouseEvent evt) {
					purchase(evt, bag, bagLabel[temp]);
				}
			});
		}
		int index = BAG_QTY - 1;
		for (int i = index; i >= 0; i--) {
			// System.out.println("index "+i);
			add(bags[i]);
		}

		add(bg);

		// settings
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setSize(WIDTH, HEIGHT);
		setUndecorated(true); // set to fullscreen
		setVisible(true);

	}

	private void purchase(java.awt.event.MouseEvent evt, Bag bag, JLabel label) {
		System.out.println("click" + bag.getColor());
		System.out.println(bag.index + " " + (stack.stack.size() - 1));
		if (bag.index == stack.stack.size() - 1) {
			stack.purchase();
			label.setVisible(false);
		} else {
			System.out.println("Can only remove top most element in stack");
		}
	}

	private void restock(java.awt.event.MouseEvent evt, int id) {
		BagColorPopUp bc = new BagColorPopUp();
	}

	private void restockBlue(int id) {
		System.out.print("restock listener " + stack.stack.size() + "bags ");

		System.out.print(stack.stack.size() + " < " + (BAG_QTY - 1));
		if (stack.stack.size() <= BAG_QTY - 1) {
			int index = stack.restock(id);
			if (index >= 0) {
				bags[index].setIcon(stack.stack.get(index).getImage());
				bags[index].setVisible(true);
			}
		}
	}

	private void replace(java.awt.event.MouseEvent evt, int id) {
		System.out.print("replace");
		int index = stack.replace(id);
		if (index >= 0) {
			bags[index].setIcon(stack.stack.get(index).getImage());
		}
	}

}
