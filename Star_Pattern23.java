import java.util.Scanner;

public class Star_Pattern23 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = scn.nextInt();
		
		for(int i=1; i<=n; i++) {
		for(char c='a'; c<='e' ; c++) {
			System.out.print(c+" ");
		}
		System.out.println();
		}

	}

}
