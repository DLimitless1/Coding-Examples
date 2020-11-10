public class Calculator {

	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(product(2, 3));
	}

	static int product(int a, int b) {
		return a * b;
	}

	static int factorial(int userInput) {
		int answer = userInput;
		for (int i = userInput ; i >= 2; i--) {
			answer = answer *(i - 1);
		}
		return answer;
	}
}