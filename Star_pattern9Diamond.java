import java.util.Scanner;

public class Star_pattern9Diamond {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter any number do you want to print :");
		int n=scn.nextInt();
		int space = n/2;
		int star = 1;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=star; j++) {
				System.out.print("*");
			}
			if(i<=n/2) {
				star = star+2;
				space--;
			}
			else {
				star = star-2;
				space++;
			}
			System.out.println();
		}
	}
}
