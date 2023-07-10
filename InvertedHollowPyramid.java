import java.util.Scanner;

public class InvertedHollowPyramid {

	public static void main(String[] args) {
		System.out.println("Enter any number");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int star = n;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=star; j++) {
				if(i==1||j==1||j==star) {
					System.out.print("* ");
				}
				else System.out.print("  ");
			}
			star--;
			System.out.println();
		}
		
	}

}
