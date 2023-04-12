import java.util.Scanner;

public class Star_Pattern31 {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter any number :");
		int n = scn.nextInt();
		int k=1;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(j%2!=0) {
					System.out.print(k+" ");
				}
				else {
					System.out.print('a'+" ");
				}
				
			}
			System.out.println();
		}
	}

}
