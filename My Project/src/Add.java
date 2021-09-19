import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in);
		System.out.println("Enter 1st number");
		int a = ss.nextInt();
		System.out.println("Enter 2nd number");
		int b = ss.nextInt();
		int c = a+b ;
		System.out.println("Addition is::::::::"+c);

	}

}
