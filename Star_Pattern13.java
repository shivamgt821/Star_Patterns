import java.util.Scanner;

public class Star_Pattern13 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = scn.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			if(i%2!=0) 
			for(int j=1; j<=n; j++) {
				System.out.print(j+" ");
				}
			else {
			for(int j=n; j>=1;j--) {
				System.out.print(j+" ");
				}
			}
			System.out.println();
		
		}

	}
}
