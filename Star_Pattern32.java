import java.util.Scanner;

public class Star_Pattern32 {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter any number :");
		int n = scn.nextInt();
		
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(j%2!=0) {
					System.out.print('*'+" ");
				}
				else {
					System.out.print('$'+" ");
				}
				
			}
			System.out.println();
		}
	}
}
