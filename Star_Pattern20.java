import java.util.Scanner;

public class Star_Pattern20 {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter any number :");
		int n = scn.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=n; j>=i; j--) {
				System.out.print(j);
				if(j>=i+1) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
