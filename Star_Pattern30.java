import java.util.Scanner;

public class Star_Pattern30 {

	public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter any number: ");
			int n = scn.nextInt();
			
			for(int i=1; i<=n; i++) {
				if(i%2!=0) {
					for(int j=1; j<=n; j++) {
						System.out.print(j+" ");
						j++;
					}
				}
					else {
						for(char c='a'; c<='g';c++) {
							System.out.print(c+" ");
							++c;
						}
					}
					System.out.println();
				}
			}
	}
