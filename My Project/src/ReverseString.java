import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in);
		System.out.println("ENTER A STRING");
		String s = ss.nextLine();
		char [] ch = s.toCharArray();
		String rev="";
		
		for(int i = ch.length-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		System.out.println("Reverse String is::"+rev);

	}

}
