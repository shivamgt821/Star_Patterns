import java.util.Scanner;

public class HollowRightTrianglePattern3 {

	public static void main(String[] args) {
		System.out.println("Enter any num");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
//				if(j<n/2) continue;
//				if(j==n||(i+j==n+1&&i<=n/2+1)||(i>n/2+1&&i==j))
					if(j==1||(i+j==n+1&&i>=n/2+1)||(i<n/2+1&&i==j))
				System.out.print("* ");
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
	
}}
