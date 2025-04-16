package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Assigment4_Collections {

	public static void main(String[] args) {
		// 1. Create Lists with area of top 5 largest cities. Print the total area of
		// the 3rd and 4th cities combined.
		// Delhi (1484), Bangalore (741), Visakhapatnam (681.96), Hyderabad (650), and
		// Lucknow (631)
		List<Float> largestCitiesarea = new LinkedList<Float>();
		largestCitiesarea.add(1484.00f);
		largestCitiesarea.add(741.0f);
		largestCitiesarea.add(681.96f);
		largestCitiesarea.add(650.00f);
		largestCitiesarea.add(631.00f);
		// the total area of the 3rd and 4th cities combined
		float cities_combined = largestCitiesarea.get(2) + largestCitiesarea.get(3);

		System.out.println("the total area of the 3rd and 4th cities combined is " + cities_combined);

		// 2. Create a set of the top 10 most visited tourist attractions in the world
		// and print out all of them and its size.
		Set<String> tourist = new HashSet<String>();
		tourist.add("Empire State Building");
		tourist.add("Eiffel Tower");
		tourist.add("Anne Frank House");
		tourist.add("Basílica de la Sagrada Familia");
		tourist.add("Cayman Crystal Caves");
		tourist.add("Colosseum");
		tourist.add("Louvre Museum");
		tourist.add("Gardens by the Bay");
		tourist.add("Duomo di Milano");
		tourist.add("Sheikh Zayed Grand Mosque Centre");
		// print out all of them and its size
		System.out.println(tourist);
		System.out.println("list size is " + tourist.size());

		// 3. Create an array of 10 numbers (any 10 numbers) and print out the Average
		// of 5th and 6th Value.
		int[] numbers = { 2, 5, 6, 4, 23, 6, 64, 76, 99, 100 };
		// print out the Average of 5th and 6th Value
		float Average = numbers[4] + numbers[5];
		System.out.println("the Average of 5th and 6th Value " + Average/2);

		// 4.Create a list of the top 5 highest-grossing movies of all time and print
		// out the third movie on the list.
		// The top 5 highest-grossing movies of all time are: Avatar, Avengers: Endgame,
		// Avatar: The Way of Water, Titanic, and Star Wars:The Force Awakens

		List<String> movies = new LinkedList<String>();

		movies.add("Avatar");
		movies.add("Avengers: Endgame");
		movies.add("Titanic");
		movies.add("Avatar: The Way of Water");
		movies.add("Star Wars: The Force Awakens");

		// print out the third movie on the list.
		System.out.println("the third movie on the list " + movies.get(2));

	}

}
