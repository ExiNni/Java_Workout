import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class 과제3 extends JFrame {
	public void paint(Graphics g) {
		for(int x=50; x<=240; x=x+10) {
			if(x%3==2) {
				g.setColor(Color.RED);
			}else if(x%3==0){
				g.setColor(Color.GREEN); 
			}else {
				g.setColor(Color.BLUE); 
			}
			g.drawRect(x, x, x, x);
		}
	
	}
}
