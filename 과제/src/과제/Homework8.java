package 과제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Homework8 extends JFrame {
	
	private JButton btnGo;
	private JTextField inputId;
	private JRadioButton sw, vr;
	
	public Homework8() {
		setTitle("전공 선택");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(4,2));
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1, 1, 0, 10));
		GoListener listener = new GoListener();
				
		JLabel label1 = new JLabel("이름과 전공을 선택하시오");
		label1.setFont(new Font("SansSerif", Font.BOLD, 20));
		label1.setForeground(Color.blue);
			
		panel.add(label1);
					
		JPanel panel2 = new JPanel();
		JLabel labelId = new JLabel("이름", JLabel.LEFT);
		inputId = new JTextField(8);
		
		panel2.add(labelId);
		panel2.add(inputId);
		
		JPanel panel3 = new JPanel();
		JLabel labelmajor = new JLabel("전공:", JLabel.LEFT);
		ButtonGroup group = new ButtonGroup();
		group.add(sw);
		group.add(vr);
		sw= new JRadioButton("소프트웨어");
		vr= new JRadioButton("가상현실");
				
		panel3.add(new JLabel());
		panel3.add(labelmajor);
		panel3.add(sw);
		panel3.add(vr);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new GridLayout(1, 5, 0, 10));
		
		JLabel label3 = new JLabel("");
		JLabel label4 = new JLabel("");
		btnGo = new JButton("Go");
		JLabel label5 = new JLabel("");
		JLabel label6 = new JLabel("");
		
		btnGo.addActionListener(listener);
				
		panel4.add(label3);
		panel4.add(label4);
		panel4.add(btnGo);
		panel4.add(label5);
		panel4.add(label6);
		
		add(panel);
		add(panel2);
		add(panel3);
		add(panel4);
		pack();
		
	}
	public class GoListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==btnGo) {
				String id= inputId.getText();
				String sw1= sw.getText();
				String vr1= vr.getText();
				
				if(id.length()==0) {
					JOptionPane.showMessageDialog(null, "이름을 입력하세요!");
				}
				else if(sw.isSelected() && vr.isSelected()) {
					JOptionPane.showMessageDialog(null, "전공을 하나만 선택하세요!");
				}
				else if(sw.isSelected()) {
					String msg = id + "님은 " + sw1 + " 전공입니다.";
					(new HomeworkResult8(msg)).setVisible(true);
					dispose();
								
				}
				else if(vr.isSelected()){
					String msg = id + "님은 " + vr1 + " 전공입니다.";
					(new HomeworkResult8(msg)).setVisible(true);
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "전공을 선택하세요!");
				}
			}
				
				
					
				
				}
			
		}
	
				
	public static void main(String[] args) {
			(new Homework8()).setVisible(true);
		}

}