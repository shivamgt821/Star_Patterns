import java.util.Scanner;

public class RightTrianglePattern2 {

	public static void main(String[] args) {
		System.out.println("Enter any num");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int star = 1;
		
		
		for(int i=1; i<=n; i++) {
		
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<=n/2)
			{
				star++;
			}
			else
			{
				star--;
			}
		}
	}

}
