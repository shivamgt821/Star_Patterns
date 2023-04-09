import java.util.Scanner;

public class Star_Pattern10_HollowPyramid {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any data :");
		int n= scn.nextInt();
		int space = n-1;
		int star = 1;
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=star; j++) {
				if(j==1||i==n||j==star) { // i==n for bottom line 
					System.out.print("*");// j==1 for left line 
				}						  // j==star for right line
				else {
					System.out.print(" ");
				}
			}
			space--;
			star=star+2;
			System.out.println();
		}
	}
}
