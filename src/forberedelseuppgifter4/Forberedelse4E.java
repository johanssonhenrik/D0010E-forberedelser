package forberedelseuppgifter4;

public class Forberedelse4E {
	private static double x;
	private static double y;
	private static double z;
	private static double radie;
	
	public static void main(String[] args) {
		
		Forberedelse4E s1 = new Forberedelse4E(x, y, z, radie);
		Forberedelse4E s2 = new Forberedelse4E(x, y, z, radie);
		
	}
	Forberedelse4E(double x, double y, double z, double radie){
		
	}
	public static double xCoord(){
		return x;
	}
	public static double yCoord(){
		return y;
	}
	public static double zCoord(){
		return z;
	}
	public static double marbleRadie(){
		return radie;
	}
	public static boolean collides(Forberedelse4E s1, Forberedelse4E s2){
	
		
		
		return true;
	}
}
