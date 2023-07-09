import java.util.Scanner;

public class HollowPyramid {

	public static void main(String[] args) {
		System.out.println("Enter any num");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int star = 1;
		int space = n-1;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=star; j++) {
				if(j==1|| i==n || j==star) {    // j==star for right line  i==n  for down line  j==1 for left line
					System.out.print("* ");
				}
				else System.out.print("  ");
			}
			star++;
			space--;
			System.out.println();
		}
		
	}

}
