package assignments;

public class Assignment2_Arrays {

	public static void main(String[] args) {
		String[][][] collage = new String[5][2][6];

		collage[0][0][0] = "Mathematics I";
		collage[0][0][1] = "Physics";
		collage[0][0][2] = "Chemistry";
		collage[0][0][3] = "Computer Programming";
		collage[0][0][4] = "Engineering Drawing";
		collage[0][0][5] = "Basic Electrical Eng.";

		collage[0][1][0] = "Pass(78)";
		collage[0][1][1] = "Pass(85)";
		collage[0][1][2] = "Fail(21)";
		collage[0][1][3] = "Pass(74)";
		collage[0][1][4] = "Pass(88)";
		collage[0][1][5] = "Pass(79)";

		collage[1][0][0] = "Mathematics II";
		collage[1][0][1] = "Mechanics";
		collage[1][0][2] = "Environmental Sci.";
		collage[1][0][3] = "Basic Electronics";
		collage[1][0][4] = "Engineering Physics";
		collage[1][0][5] = "Engineering Graphics";

		collage[1][1][0] = "Pass(82)";
		collage[1][1][1] = "Pass(77)";
		collage[1][1][2] = "Pass(93)";
		collage[1][1][3] = "Fail(19)";
		collage[1][1][4] = "Fail(24)";
		collage[1][1][5] = "Pass(90)";

		collage[2][0][0] = "Data Structures";
		collage[2][0][1] = "Discrete Mathematics";
		collage[2][0][2] = "Digital Electronics";
		collage[2][0][3] = "Operating Systems";
		collage[2][0][4] = "Signals and Systems";
		collage[2][0][5] = "Object-Oriented Prog.";

		collage[2][1][0] = "Pass(88)";
		collage[2][1][1] = "Pass(81)";
		collage[2][1][2] = "Pass(76)";
		collage[2][1][3] = "Fail(32)";
		collage[2][1][4] = "Pass(85)";
		collage[2][1][5] = "Pass(78)";

		collage[3][0][0] = "Algorithms";
		collage[3][0][1] = "Computer Networks";
		collage[3][0][2] = "collagebase Systems";
		collage[3][0][3] = "Microprocessors";
		collage[3][0][4] = "Communication Eng.";
		collage[3][0][5] = "Software Engineering";

		collage[3][1][0] = "Pass(91)";
		collage[3][1][1] = "Pass(73)";
		collage[3][1][2] = "Fail(19)";
		collage[3][1][3] = "Pass(80)";
		collage[3][1][4] = "Pass(76)";
		collage[3][1][5] = "Pass(87)";

		collage[4][0][0] = "Probability & Stats";
		collage[4][0][1] = "Machine Learning";
		collage[4][0][2] = "Compiler Design";
		collage[4][0][3] = "Theory of Computation";
		collage[4][0][4] = "Embedded Systems";
		collage[4][0][5] = "Computer Graphics";

		collage[4][1][0] = "Pass(86)";
		collage[4][1][1] = "Pass(88)";
		collage[4][1][2] = "Pass(84)";
		collage[4][1][3] = "Pass(95)";
		collage[4][1][4] = "Pass(73)";
		collage[4][1][5] = "Pass(90)";

		// Print Semester 2 Subject 4 and Subject 5 names.
		System.out.println("Semester 2, Subject 4: " + collage[1][0][3]);
		System.out.println("Semester 2, Subject 5: " + collage[1][0][4]);

		// Print the Status/Marks of Semester 4 Subject 3 and Subject 6.
		System.out.println("Semester 4, Subject 3 Marks: " + collage[4][1][2]);
		System.out.println("Semester 4, Subject 6 Marks: " + collage[4][1][5]);

	};
}
