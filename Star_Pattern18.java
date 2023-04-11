import java.util.Scanner;

public class Star_Pattern18 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any data :");
		int n = scn.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=n; j>=i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
