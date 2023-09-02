import java.util.Scanner;

public class 평변환 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("평 수를 입력하세요");
		int p = input.nextInt();
		double squareMeter;
		squareMeter = p*3.305758;
		System.out.println(p+"평은" + squareMeter + "제곱미터입니다");
	}

}
