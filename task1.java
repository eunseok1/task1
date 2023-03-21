package task1;
import java.util.Scanner;

public class task1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산>>");
		double b = sc.nextDouble();
		String a=sc.next();
		double c = sc.nextDouble();
	
		if(a.equals("+"))
			System.out.print(b+a+c+"의 계산 결과는:"+(b+c));
		else if(a.equals("-"))
			System.out.print(b+a+c+"의 계산 결과는:"+(b-c));
		else if(a.equals("*"))
			System.out.print(b+a+c+"의 계산 결과는:"+(b*c));
		else if(a.equals("/"))
			if (c==0)
				System.out.print("계산이 불가능합니다");
			else
				System.out.print(b+a+c+"의 계산 결과는:"+(b/c));
		sc.close();
	}
}


