import java.util.Scanner;

public class Star_pattern01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = scn.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.print("*");
			
			if(i==n) {
				System.out.println();
				i=0;
				n--;
				
			}
		}
	}
}
