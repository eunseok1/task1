package task1;
import java.util.Scanner;

public class task1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����>>");
		double b = sc.nextDouble();
		String a=sc.next();
		double c = sc.nextDouble();
	
		if(a.equals("+"))
			System.out.print(b+a+c+"�� ��� �����:"+(b+c));
		else if(a.equals("-"))
			System.out.print(b+a+c+"�� ��� �����:"+(b-c));
		else if(a.equals("*"))
			System.out.print(b+a+c+"�� ��� �����:"+(b*c));
		else if(a.equals("/"))
			if (c==0)
				System.out.print("����� �Ұ����մϴ�");
			else
				System.out.print(b+a+c+"�� ��� �����:"+(b/c));
		sc.close();
	}
}


