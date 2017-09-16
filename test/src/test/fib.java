package test;
/*
 * A recursive fib sequence!
 * xn = xn-1 + xn-2
 * 
 * Sequence starting: 0,1,1,2,3,5,8,13,21,34...
 */
public class fib {
	public static void main(String[] args) {
		System.out.println(calcfib(0));
	}
	
	static int calcfib(int num) {
		if(num <= 0) return 0;
		else if(num < 2) return 1;
		else {
			return calcfib(num-1) + calcfib(num-2);
		}
	}
}
