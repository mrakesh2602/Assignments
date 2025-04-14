package assignments;

public class Assignment3_EmpGroups {

	public static void main(String[] args) {
		Assignment3_Employees obj = new Assignment3_Employees();

		String[] employeeNames = new String[3];
		employeeNames[0] = obj.empName1;
		employeeNames[1] = obj.empName2;
		employeeNames[2] = obj.empName3;

		int[] employeeIDs = new int[3];
		employeeIDs[0] = obj.empID1;
		employeeIDs[1] = obj.empID2;
		employeeIDs[2] = obj.empID3;

		// Print the data
		System.out.println(employeeNames[0] + " : " + employeeIDs[0]);

	};

}
