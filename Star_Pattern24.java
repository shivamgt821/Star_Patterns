import java.util.Scanner;

public class Star_Pattern24 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = scn.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=n; j>=1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
