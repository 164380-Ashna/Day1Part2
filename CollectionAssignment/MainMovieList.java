package CollectionAssignment;

public class MainMovieList {
public static void main(String[] args){
		
	Movie_DetailsList mv=new Movie_DetailsList();
		
		mv.add_movie( "Twilight",  "Robert",
				 "Kristen",  "Supernatural" );
		mv.add_movie( "Titanic",  "Leo",
				 "Kate",  "Romantic" );
		mv.add_movie( "Friends",  "Ross",
				 "Rachel",  "Comedy" );
		mv.add_movie( "Salt",  "Brad",
				 "Angelina",  "Action" );
		
		mv.remove_movie("Twilight",  "Robert",
				 "Kristen",  "Supernatural");
		
		mv.find_movie_by_mov_name("Salt");
		
		mv.find_movie_by_genre("Comedy");
		
	//	mv.remove_Allmovie();
		System.out.println(mv.moviename);
		System.out.println(mv.movieactor);
		System.out.println(mv.movieactress);
		System.out.println(mv.moviegenre);
	}


}
