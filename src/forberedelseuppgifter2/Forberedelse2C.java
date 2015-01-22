package forberedelseuppgifter2;

public class Forberedelse2C {

	public static void main(String[] args) {
		
		int n = 11;

		if(isPrime(n)){
			System.out.println(n + " is a Prime Number! Hooray!");
		}else{
			System.out.println(n + " is not a Prime Number! Oh No..!");}
	}
	
	public static boolean isPrime(int n){

		int i;
		int x = n;
		
		for(i=n; i>1; i--){
			if(x%i!=0 && isPrime(n-1)){
				System.out.println(n);
				return true;
			}
		}//for end-bracket
		return false;
	}
}