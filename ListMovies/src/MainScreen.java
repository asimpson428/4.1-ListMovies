import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainScreen {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		String continu;

		do { 
			
			ArrayList<Movie> movieList = new ArrayList<>();
			movieList.add(new Movie("Citizen Kane", "drama"));
			movieList.add(new Movie("Casablanca", "drama"));
			movieList.add(new Movie("The Godfather", "drama"));
			movieList.add(new Movie("Star Wars", "scifi"));
			movieList.add(new Movie("2001: A Space Odyssey", "scifi"));
			movieList.add(new Movie("Psycho", "horror"));
			movieList.add(new Movie("King Kong", "horror"));
			movieList.add(new Movie("E.T. The extra-terrestrial", "scifi"));
			movieList.add(new Movie("Snow White And The Seven Dwarfs", "animated"));
			movieList.add(new Movie("Fantasia", "animated"));
			
			//Collections.sort(title, category);
			
			System.out.println("Welcome to the Movie List Application!");

			System.out.println("There are 10 movies in this list.");

			System.out.println("What cetegory are you interested in? Please select drama, animated, horror or scifi.");
			
			String category = scan.nextLine();
			
			System.out.println(category);
		
			//System.out.println(movieList.get(0).toString());
			
			
				for (int i = 0; i < movieList.size(); i++) {
					
					
					if (category.equals(movieList.get(i).getCategory())) { 
					System.out.println(i + " " + movieList.get(i).getTitle() + " " + movieList.get(i).getCategory());
				}
				
				}
				
				System.out.println("Would you like to conitnue? Y/N");
				continu = scan.nextLine();
				
					
					
			
		} while (continu.equals("Y")); 
				
			
					
				
		scan.close();
		}
}

	
		
		/*
		 * List<String> movieList1 = new ArrayList<>(); movieList1.add(new String(
		 * "drama")); movieList1.add(new String("drama"));
		 */
		/*ArrayList<String, String> movieList2 = new ArrayList<>();
		movieList2.add( "Citizen Kane", "drama");
		movieList2.add("Casablanca", "drama");*/
		
		
			
		  //for (Movie single : movieList) { 
			  //if (single.getCategory().equals(category)) {
		 // }
		  //System.out.println(single.toString());
		  //System.out.println(single.getTitle().toString());
		  //}
		  
		  
		 
		
	
	
	
	
	