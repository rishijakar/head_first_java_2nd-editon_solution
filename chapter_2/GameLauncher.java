import java.util.Random;
class GuessGame{
	Player p1;
	Player p2;
	Player p3;

	void startgame(){
		p1=new Player();
		p2=new Player();
		p3=new Player();

		int targetNumber;
		int p1guess;
		int p2guess;
		int number;
		int p3guess;
		boolean p1istrue=false;
		boolean p2istrue=false;
		boolean p3istrue=false;

		
	targetNumber=(int)(Math.random()*10);
		System.out.println("I am thinking of a number between 0 to 10");
		while(true){
			System.out.println("number to guess is"+targetNumber);

			p1.guess();
			p2.guess();
			p3.guess();
		

			p1guess=p1.number;
			p2guess=p2.number;
			p3guess=p3.number;
			System.out.println("player one guessed"+p1guess);
			System.out.println("player two guessed"+p2guess);
			System.out.println("player three guessed"+p3guess);

			if(p1guess==targetNumber){
				p1istrue=true;

			}
			if(p2guess==targetNumber){
				p2istrue=true;

			}
			if(p3guess==targetNumber){
				p3istrue=true;
			}
			if(p1istrue||p2istrue||p2istrue){
				System.out.println("yoo!!! we have a winner");
				System.out.println("Is player one win the game?"+p1istrue);
				System.out.println("Is player two win the game?"+p2istrue);
				System.out.println("Is player three win the game?"+p3istrue);
				System.out.println("Game is over?");
			}

			else{
				System.out.println("player have to try again");

			}
   
			

		}
	}
}
class Player{
	   public void guess(){
		 int number=(int)(Math.random()*10);
	   
		System.out.println("I am guessing"+number);

	}
	
}
class GameLauncher{
	public static void main(String[] args){
		GuessGame game = new GuessGame();
		game.startgame();

	}
} 