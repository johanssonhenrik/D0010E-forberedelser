package forberedelseuppgifter2;

public class Forberedelse2B {

	public static void main(String[] args) {

		siffersumma(32);
	}
	
	public static int siffersumma(int n){

		if(n==0){
			return 0;
		}
		
		return n + siffersumma(n-1);

	}

}
