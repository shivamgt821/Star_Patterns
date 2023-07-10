import java.util.Scanner;

public class LeftTrianglePattern {

	public static void main(String[] args) {
		System.out.println("Enter any num : ");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int space = n/2;
		int star = 1;
		
		for(int i=1;i<=n; i++) {
			
			for(int j=1; j<=space; j++) System.out.print("  ");
			
			for(int j=1; j<=star; j++) System.out.print("* ");
			
			System.out.println();
			
			if(i<=n/2) {
				space--;
				star++;
			}
			else {
				star--;
				space++;
			}
			
		}
		
	}

}
