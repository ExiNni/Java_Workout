package 과제;

import java.awt.Color;

import java.awt.Container;

import java.awt.FlowLayout;

import java.awt.Graphics;

import java.awt.event.ItemEvent;

import java.awt.event.ItemListener;

 

import javax.swing.ButtonGroup;

import javax.swing.JFrame;

import javax.swing.JRadioButton;

 

public class RadioBtnColor extends JFrame{

	private JRadioButton red, green, blue;

	private Color color;

	

	private class RadioListener implements ItemListener{

		@Override

		public void itemStateChanged(ItemEvent e) {

			if(e.getItem()==red)

				color = Color.red;

			else if (e.getItem()==green)

				color = Color.green;

			else if (e.getItem()==blue)

				color = Color.blue;

			

			repaint();

		}

	}

	public RadioBtnColor() {

		setSize(300, 350);

		setTitle("RadioButton Color Example");

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		

		red= new JRadioButton("Red");

		green= new JRadioButton("Green");

		blue = new JRadioButton("Blue");

		ButtonGroup group = new ButtonGroup();

		group.add(red);

		group.add(blue);

		group.add(green);

		RadioListener listener = new RadioListener();

		red.addItemListener(listener);

		green.addItemListener(listener);

		blue.addItemListener(listener);

		

		Container cPane = getContentPane();

		cPane.setLayout(new FlowLayout());

		cPane.add(red);

		cPane.add(green);

		cPane.add(blue);

		}

	@Override

	public void paint(Graphics g) {

		super.paint(g);

		g.setColor(color);

		g.fillOval(50, 80, 200, 200);

	}

	public static void main(String[] args) {

		(new RadioBtnColor()).setVisible(true);

	}

	

}