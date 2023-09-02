import java.util.Scanner;

public class Star_Pattern21_SnakePattern  {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any data :");
		int n = scn.nextInt();
		int k = 1;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i>=j) {
				if(i%2==0) {
				System.out.print(k+" ");
				}
				k++;
			}
		}
			int l = k-1;
			for(int j=0; j<n; j++) {
				if(i>=j) {
					if(i%2==1) {
						System.out.print(l+" ");  // we cane direct use l--+" "
					}
					l--;
				}	
			}
			System.out.println();
		}
	}
}
