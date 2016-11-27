package utils;

public class Math {

	public static long factorial (int num) {
		if(num <= 0) return 1;

		else {
			return num * factorial(num - 1);
		}
	}

	public static long factorialLoop (int num) {
		long product = 1;
		for(int i = num;  i >= 1; i--) {
			product *= i;
		}
		return product;
	}
}