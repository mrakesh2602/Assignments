package assignments;

public class Assignment12_PowerOfN {

	public double PowerCal(double num1, int num2) {
		double output = 1;
		if (num2 < 0) {
			num2 = -num2;
		}

		for (int i = 1; i <= num2; i++) {
			output = output * num1;
		}

		return output;

	}

	public double test(double num1, int num2) {
		double output = 1;
		if (num2 >= 0) {
			output = PowerCal(num1, num2);
		} else {
			output = 1 / (PowerCal(num1, num2));
		}

		return output;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Assignment12_PowerOfN obj = new Assignment12_PowerOfN();

		double final1 = obj.test(2.00000, -2);
		System.out.println(final1);

	}
}
