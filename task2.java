package task2;
import java.util.Scanner;

public class task2 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("����>>");
		double b = sc.nextDouble();
		String a=sc.next();
		double c = sc.nextDouble();
		switch (a) {
			case "+":
				System.out.print(b+a+c+"�� ��� �����:"+(b+c));
				break;
			case "-":
				System.out.print(b+a+c+"�� ��� �����:"+(b-c));
				break;
			case "*":
				System.out.print(b+a+c+"�� ��� �����:"+(b*c));
			break;
			case "/":
				if (c==0)
					System.out.print("����� �Ұ����մϴ�");
				else
					System.out.print(b+a+c+"�� ��� �����:"+(b/c));
				break;
			default:
				System.out.print("�ٽ� �Է��� �ּ���");
		sc.close();
	}
}
}