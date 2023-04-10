import java.util.Scanner;

public class Star_Pattern16 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any data do you want to print");
		int n = scn.nextInt();
		int space = 1;
		int num = n;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<space; j++) {
				System.out.print("  ");
			}
			for(int j=num; j>=1; j--) {
				System.out.print(j+" ");
			}
			space++;
			num--;
			System.out.println();
		}	
	}
}
