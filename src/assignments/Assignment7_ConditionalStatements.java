package assignments;

public class Assignment7_ConditionalStatements {

	public static void main(String[] args) {

		String customerName = "John Doe";
		int creditScore = 720;
		float income = 55000.0f;
		boolean isEmployed = true;
		float debtToIncomeRatio = 35.0f;

		if (creditScore > 750) {
			System.out.println(customerName + " loan is automatically approved. ");

		} else if (creditScore >= 650 && creditScore <= 750) {
			System.out.println("additional checks are performed for creditScore between 650 to 750 ");
			if (income > 50000) {

				if (isEmployed == true) {

					if (debtToIncomeRatio < 40) {
						System.out.println(customerName + " loan is approved");

					}

					else {
						System.out.println(customerName + "loan is denied.");
					}
				}
			}
		}

		if (creditScore < 650) {
			System.out.println(customerName + " loan is automatically  denied. ");
		}
	}
}
