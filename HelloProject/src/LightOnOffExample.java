import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

 

public class LightOnOffExample extends JFrame {
	private boolean isOn = false;
	
	public LightOnOffExample() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("House 예제");
		
		Container cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		JButton button = new JButton("열기");
		button.addActionListener(new BtnListener());
		cPane.add(button);
	}
	public void paint(Graphics g) {
		int x[] = {50,200,350,350,50};
		int y[] = {180,140,180,300,300};
		
		g.setColor(Color.DARK_GRAY);
		g.fillPolygon(x, y, x.length);
		
		if (isOn)
			g.setColor(Color.yellow);
		else
			g.setColor(Color.red);
			g.fillRect(180, 240, 40, 60);
	
		
	}
	private class BtnListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			isOn=!isOn;
			JButton btn = (JButton) e.getSource();
			btn.setText(isOn? "열기" : "닫기");
			repaint();
		}
		
		}
	public static void main(String[] args) {
		(new LightOnOffExample()).setVisible(true);
	}

}