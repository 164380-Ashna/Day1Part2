package CollectionAssignment;

import java.util.ArrayList;

public class Movie_DetailsList {
	
	
	static ArrayList moviename=new ArrayList();
	ArrayList movieactor=new ArrayList();
	ArrayList movieactress=new ArrayList();
	ArrayList moviegenre=new ArrayList();
	

	/*Movie_Details movie1 = new Movie_Details("Twilight", "Robert", "Kristen",
			"Supernatural");
	Movie_Details movie2 = new Movie_Details("Salt", "Ross", "Angelina",
			"Action");
	Movie_Details movie3 = new Movie_Details("Titanic", "Leo", "Kate",
			"Romantic");
	Movie_Details movie4 = new Movie_Details("Conjuring", "Joey", "Rachel",
			"Horror");
*/
	public void add_movie(String mov_Name, String lead_actor,
			String lead_actress, String genre ) {
		
		moviename.add(mov_Name);
		movieactor.add(lead_actor);
		movieactress.add(lead_actress);
		moviegenre.add(genre);
		
		System.out.println("the movie is added");
	}

	public  void remove_movie(String mov_Name, String lead_actor,
			String lead_actress, String genre ) {
		
		moviename.remove(mov_Name);
		movieactor.remove(lead_actor);
		movieactress.remove(lead_actress);
		moviegenre.remove(genre);

	}

	public void remove_Allmovie() {
		
		moviename.clear();
		movieactor.clear();
		movieactress.clear();
		moviegenre.clear();
		

	}

	public void find_movie_by_mov_name(String mov_Name) {
		
		if(moviename.contains(mov_Name)){
			System.out.println("Movie Found");
			int index=moviename.indexOf(mov_Name);
			System.out.println("The name of the movie is   "+moviename.get(index));
			System.out.println("The actor of the movie is   "+movieactor.get(index));
			System.out.println("The actress of the movie is   "+movieactress.get(index));
			System.out.println("The genre of the movie is   "+moviegenre.get(index));
		}
		else {
			System.out.println("Movie not found");
		}
		 
		
	}

	public void find_movie_by_genre(String genre) {
		
		if(moviegenre.contains(genre)){
			System.out.println("Movie Found");
			int index=moviegenre.indexOf(genre);
			System.out.println("The name of the movie is   "+moviename.get(index));
			System.out.println("The actor of the movie is   "+movieactor.get(index));
			System.out.println("The actress of the movie is   "+movieactress.get(index));
			System.out.println("The genre of the movie is   "+moviegenre.get(index));
		}
		else {
			System.out.println("Movie not found");
		}
		 

	}

	}
