import java.util.Scanner;

public class Star_Pattern28 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = scn.nextInt();
		int k = n;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(k+" ");
			}
			k--;
			System.out.println();
		}
	}
}
