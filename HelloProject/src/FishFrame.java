import java.awt.Graphics;

import javax.swing.JFrame;

public class FishFrame extends JFrame {
	public void paint(Graphics g) {
		g.drawRect(30, 50, 330, 210);
		g.drawArc(30, 0, 300, 200, 210, 150);
		g.drawArc(30, 100, 300, 200, 0, 150);
		g.drawOval(70, 135, 30, 30);
		g.fillOval(70, 135, 30, 30);
		g.drawLine(330, 100, 330, 200);
		
	}
}
