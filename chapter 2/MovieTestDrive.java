class Movie{
	String title;
	String genre;
	int rating;

	void playIt(){
		System.out.println("play the Movie");
	}
}

public class MovieTestDrive{
	public static void main (String[] args){
	Movie one = new Movie();
	one.title="golmaal returns";
	one.genre="funny";
	one.rating=4;
	one.playIt();
	 Movie two= new Movie();

	 two.title="trapped";
	 two.genre="serious";
	 two.rating=5;
	 two.playIt();
	  Movie three = new Movie();

	  three.title="deapdool";
	  three.genre="comedy";
	  three.rating= 3;
	  three.playIt();

	}


}