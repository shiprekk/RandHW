package lab3;

public class Recursion {
	
	public static int sum(int n) {
		if (n == 1) {
			return 2;
		}
		return ((2 * n) + sum(n-1));
	}
	
	
	public static void main(String[] args) {
//		System.out.print("Example  1: ");
//		double n = (int)Math.random()* 10;
//		
//		System.out.print("Example  2: ");
//		
//		System.out.print("Example  3: ");
		
		for (int i = 0; i < 3; i++) {
			int n = (int)((Math.random() * (11 - 1)) + 1);
			System.out.println("Example" + (i + 1) + ": \n");
			System.out.println("Enter n: " + n);
			int sum = sum(n);
			System.out.println("Sum: " + sum);
			System.out.println();
		}
		
	}

}