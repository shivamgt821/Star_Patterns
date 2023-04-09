import java.util.Scanner;
public class Star_pattern8 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any number :");
		int n = scn.nextInt();
		int space=1;
		int star=n;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<space; j++) {
				System.out.print(" ");
			}
			for(int j=n; j>=i; j--) {
				System.out.print("*");
			}
			space++;
			star--;
			System.out.println();
		}
	}

}
