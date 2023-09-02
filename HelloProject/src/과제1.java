import java.awt.Graphics;

import javax.swing.JFrame;

public class 과제1 extends JFrame {
	public void paint(Graphics g) {
		g.drawOval(300, 300, 300, 300);
		g.drawLine(300, 700, 700, 700);
		g.drawLine(750, 300, 750, 800);
		g.drawLine(850, 300, 1250, 300);
		g.drawLine(1050, 300, 850, 800);
		g.drawLine(1050, 300, 1250, 800);
		g.drawLine(1350, 300, 1350, 800);
		g.drawLine(1350, 550, 1550, 550);
		g.drawLine(1550, 300, 1550, 800);
		
	}
}
