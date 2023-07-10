public class InvertedPyramidPattern2 {

	public static void main(String[] args) {
		
		for(int i=5;i>=1;i--)
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
