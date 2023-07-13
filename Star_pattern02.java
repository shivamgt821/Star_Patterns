import java.util.Scanner;

public class Star_pattern02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = scn.nextInt();
		String s = "";
		for(int i=n; i>=1; i--) {
			s = s+"*";
			System.out.println(s);
		}
	}
}
