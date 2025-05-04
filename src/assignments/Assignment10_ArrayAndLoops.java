package assignments;

public class Assignment10_ArrayAndLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 12, 34, 11, 36, 87, 98, 93 };
		int temp = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {

				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}

			}

		}
		System.out.println("and Print second and third largest number" + array[1] + " and " + array[2]);
	}

}
