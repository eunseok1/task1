package task2;
import java.util.Scanner;

public class task2 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("연산>>");
		double b = sc.nextDouble();
		String a=sc.next();
		double c = sc.nextDouble();
		switch (a) {
			case "+":
				System.out.print(b+a+c+"의 계산 결과는:"+(b+c));
				break;
			case "-":
				System.out.print(b+a+c+"의 계산 결과는:"+(b-c));
				break;
			case "*":
				System.out.print(b+a+c+"의 계산 결과는:"+(b*c));
			break;
			case "/":
				if (c==0)
					System.out.print("계산이 불가능합니다");
				else
					System.out.print(b+a+c+"의 계산 결과는:"+(b/c));
				break;
			default:
				System.out.print("다시 입력해 주세요");
		sc.close();
	}
}
}