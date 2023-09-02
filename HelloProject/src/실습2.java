import javax.swing.JOptionPane;

public class 실습2 {
	public static void main(String[] args) {
		String FString= JOptionPane.showInputDialog("화씨온도를 입력하세요:");
		int F = Integer.parseInt(FString);
		
		double C= (F-32)/1.8;
		JOptionPane.showMessageDialog(null, "화씨 " + F + "도는 섭씨 " + C + "도 입니다.");
		System.exit(0);
		
		
	}

}
