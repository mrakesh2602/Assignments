package assignments;

public class Assignment13_PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 25;

		boolean prime = true;

		for (int i = 2; i < input; i++) {
			if (input % i == 0) {
				prime = false;
			}

		}
		
		if (prime) {
			System.out.println(input + " is a prime number");
		} else {
			System.out.println(input + " is not a prime number");
		}

	}

}
