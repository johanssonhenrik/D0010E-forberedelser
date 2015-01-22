package forberedelseuppgifter2;

public class Forberedelse2C {

	public static void main(String[] args) {
		int n = 10;

		if(isPrime(n)){
			System.out.println(n + " is a Prime Number! Hooray!");
		}else{
			System.out.println(n + " is not a Prime Number! Oh No..!");}
	}
	
	public static boolean isPrime(int n){
		
		for(int i=2; i<n; i++){
			System.out.println(i);
			if((n/i)%10!=0){
				return false;
			}else{
				System.out.println("hej");
			}
			
		return false;
			
		}//for
	
		return true;
	}
}
