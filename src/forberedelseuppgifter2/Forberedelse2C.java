package forberedelseuppgifter2;

public class Forberedelse2C {

	public static void main(String[] args) {
		
		int n = 6912;

		if(isPrime(n)){
			System.out.println(n + " is a Prime Number! Hooray!");
		}else{
			System.out.println(n + " is not a Prime Number! Oh No..!");}
	}
	
	public static boolean isPrime(int n){

		int i;
		
		for(i=n-1; i>=2; i--){
			if(n%i==0){
				System.out.println("");
				System.out.println("Since "+n+"/"+i+" = "+n/i+" we can conclude that");
				return false;
			}
			//System.out.println(i);
		}//for end-bracket
		return true;
	}
}//Henrik Johansson ehioja-0 2015-January-22