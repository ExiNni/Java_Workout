import java.util.Scanner;

public class String예제 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("문장을 입력하시오:");
		String line = input.nextLine();
		String lowerLine= line.toLowerCase();
		System.out.println("삭제할 단어를 입력하시오:");
		String word = input.next().toLowerCase();
		
		int beginIndex = lowerLine.indexOf(word);
		String result = line.substring(0, beginIndex) + line.substring(beginIndex+word.length());
		System.out.println("입력 단어가 삭제된 문장: \n" + result);
		
	}

}
