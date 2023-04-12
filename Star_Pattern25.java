import java.util.Scanner;

public class Star_Pattern25 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = scn.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(char c='e'; c>='a'; c--) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}
