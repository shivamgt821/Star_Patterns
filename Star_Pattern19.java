import java.util.Scanner;

public class Star_Pattern19 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any number :");
		int n = scn.nextInt();
		int space = n-1;
		
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print("  ");
			}
			for(int j=i; j>=1; j--) {
				System.out.print(j+" ");
			}
			space--;
			System.out.println();
		}
	}
}
