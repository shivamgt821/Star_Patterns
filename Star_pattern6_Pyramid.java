import java.util.Scanner;

public class Star_pattern6_Pyramid {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any number do you want to print :");
		int n=scn.nextInt();
		int star = 1;
		int space = n-1;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=star; j++) {
				System.out.print("*");
			}
			star=star+2;
			space--;
			System.out.println();
			
		}
	
	}

}
