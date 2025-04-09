package language.basics;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.logging.Logger;

public class FirstJavaProgram {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		// Sysout + control space

		// Debugging and error Detection
		// Monitoring program Execution
		// Testing and validation
		// Education and learning
		// logging system

		System.out.println("Hello, World!");

		// print the content and then stay on same line
		System.out.print("Hello ");
		System.out.print("World!");
		System.out.println();

		// print the formated concept and then stay on same line
		System.out.printf("%s is completed Btech,empid is %d and Visa status is %b", "Rakesh", 1234, true);
		System.out.println();

		// Format the digits and then print the formated content and then stau on same
		// line
		// %n is used to go for next line
		System.out.format("Total Bill is %.2f %n", 102.769543539);
		System.out.println();

		// print the char statements together
		System.out.append("my name is Rakesh").append(" I am from Hyderabad");
		System.out.println();
		// print the char based on ASCII value

		System.out.write(65);
		System.out.println();
		// System.out.write(1);
		// print logs of the program
		Logger log = Logger.getLogger("Mylogger");
		log.info("this is information log");
		log.warning("this is warning log");

		// print the errors in program statements
		System.err.println("Error : Expected result is not matching with actual Result");
		PrintWriter writer = new PrintWriter("C:\\AutomationTraining\\AutomationProject\\Logs.txt");
		writer.println(LocalDateTime.now() + "current line 55 is running");
		writer.println(LocalDateTime.now() + "currently line 56 is running");
		writer.println("Execution is completed");
		writer.close();

	}

}
