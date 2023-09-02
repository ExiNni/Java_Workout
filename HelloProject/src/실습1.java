import java.util.Scanner;

public class 실습1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int hap = a+b+c;
		
		System.out.println("정수 3개의 합은=" + hap + "입니다.");
		
		System.out.println("정수 3개의 평균은?");
		int avg= (a+b+c)/3;
		System.out.println("평균=" + avg + "입니다.");
		
		
		
	}

}
