class DVDPlayer{
	boolean canRecoed =false;

	 void recordDVD(){
	 	System.out.println("RECORD DVD");

	}

	void playDVD(){
		System.out.println("PLAY DVD");

	}
}

public class DVDPlayerTestDrive{

public static void main(String[] args) {
	

DVDPlayer t = new DVDPlayer() ;
t.canRecoed=true;
t.playDVD();

if(t.canRecoed==true){
	t.recordDVD();

}
}
}

