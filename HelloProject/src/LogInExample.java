import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class LogInExample extends JFrame{
	public LogInExample() {
		setSize(300, 150);
		setTitle("LogInExample");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		Container cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		GridLayout layout1 = new GridLayout(5,3);
		setLayout(layout1);
		add(new JLabel(""));
		add(new JLabel("아이디"));
		add(new JTextField());
		add(new JLabel(""));
		add(new JLabel("비밀번호"));
		add(new JTextField());
		add(new JLabel(""));
		add(new JLabel(""));
		add(new JCheckBox("아이디 저장"));
		add(new JButton("로그인"));
		add(new JLabel(""));
		add(new JButton("취소"));
	
		
	}
}
	