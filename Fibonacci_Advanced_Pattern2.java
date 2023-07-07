public class Fibonacci_Advanced_Pattern2 {

	public static void main(String[] args) 
	{
		fib(0,1,5);
	}
	public static void fib(int a,int b,int size) {
		int n = (size*2)-1;
		int c = 0;
		int spaces = size-1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=spaces; j++) {
				System.out.print(" ");
			}
			System.out.println(a);
			if(i>=size) {
				spaces++;
				c = b-a;
				b = a;
				a = c;
			}
			else {
				spaces--;
				c = a+b;
				a = b;
				b = c;
			}
		}
	}

}
