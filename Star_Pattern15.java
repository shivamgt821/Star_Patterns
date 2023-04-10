import java.util.Scanner;

public class Star_Pattern15 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any number :");
		int n = scn.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=n; j++) {
				System.out.print(j);
			}
			for(int k=1; k<=(i-1); k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		
	}

}
