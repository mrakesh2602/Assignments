package assignments;

public class Assignment6_Operators {

	public static void main(String[] args) {
		String[] names = { "Suresh", "Mahesh", "Naresh" };
		int[] marks = { 75, 80, 82 };
		marks[0] += 10;
		marks[1] += 10;
		marks[2] += 10;
		System.out.println("updated marks : ");
		System.out.println(names[0] + ":" + marks[0]);
		System.out.println(names[1] + ":" + marks[1]);
		System.out.println(names[2] + ":" + marks[2]);

		int sum = marks[0] + marks[1] + marks[2];
		float avg = sum / 3;
		System.out.println("Average Marks:" + avg);

	}

}
