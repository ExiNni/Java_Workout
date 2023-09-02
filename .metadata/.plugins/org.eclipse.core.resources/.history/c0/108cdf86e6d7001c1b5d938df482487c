import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LoginResultFrame extends JFrame {
	
	public LoginResultFrame(String msg) {
		setSize(400,200);
		setTitle("Login Result");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Welcome to Login Example!!",SwingConstants.CENTER);
		label.setFont(new Font("SansSerif", Font.BOLD, 26));
		label.setForeground(Color.blue);
		JLabel msgLabel = new JLabel(msg);
		msgLabel.setFont(new Font("Serif", Font.PLAIN,20));
		
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		container.add(label);
		container.add(msgLabel);
	}

}
