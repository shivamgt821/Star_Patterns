import java.util.Scanner;

public class Star_pattern4 {
	
	public static void main(String...args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any number do you want to print :");
		int n=scn.nextInt();
		
		for(int i=1; i<=n ; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
