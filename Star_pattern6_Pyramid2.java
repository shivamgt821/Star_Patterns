public class Star_pattern6_Pyramid2 {

	public static void main(String[] args) {

		for(int i=1;i<=5;i++)
		{
			for(int spaces=5;spaces>i;spaces--)
			{
				System.out.print(" ");
			}
			for(int stars=1;stars<=i;stars++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
