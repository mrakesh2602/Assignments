package assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment9_ConditionalStatementsLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] employee = { "Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green" };

		Double[] emp1data = { 75000.0, 5.1, 4.2 };
		Double[] emp2data = { 68000.0, 3.2, 3.8 };
		Double[] emp3data = { 82000.0, 7.1, 4.5 };
		Double[] emp4data = { 90000.0, 10.2, 2.5 };
		Double[] emp5data = { 60000.0, 2.4, 3.5 };

		Map<String, Double[]> employeedata = new HashMap<>();
		employeedata.put(employee[0], emp1data);
		employeedata.put(employee[1], emp2data);
		employeedata.put(employee[2], emp3data);
		employeedata.put(employee[3], emp4data);
		employeedata.put(employee[4], emp5data);

		Map<String, Double> hikemap = new HashMap<>();

		for (String emp : employee) {
			Double[] data = employeedata.get(emp);

			double baseSalary = data[0];
			double experience = data[1];
			double rating = data[2];
			double variablePayPercentage;
			double bonus;
			double reward = 0;
			if (rating >= 4) {
				variablePayPercentage = 15.0;
				bonus = 1500;
			} else if (rating >= 3 && rating < 4) {
				variablePayPercentage = 10.0;
				bonus = 1200;
			} else {
				variablePayPercentage = 3.0;
				bonus = 300;

			}

			if (experience >= 5) {
				reward = 5000;
			}

			// Hike = ( Base Salary * variable pay % ) + Bonus + Reward ;
			double hike = (baseSalary * variablePayPercentage / 100) + bonus + reward;
//			Hike % = Hike / Base Salary .
			Double hikepercentage = (hike / baseSalary) * 100;
			hikemap.put(emp, hikepercentage);
		}
		// Print hike details
		System.out.println("Employee Hike Details:");
		System.out.println(hikemap);
	}

}
