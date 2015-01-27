package forberedelseuppgifter4;

public class Forberedelse4D {

	public static void main(String[] args) {

		int n = 10;
		System.out.println(n+even(n));
		System.out.println(n+uneven(n));
	}
	static String even(int n){
		
		if(n==0 || ((n-1)%2)!=0){ //Jämnt ifall n == 0. ELLER om (n-1)%2 != 0
			return " is an even number!";
		}else{
			return " is not an even number!";
		}
	}
	static String uneven(int n){
		
		if(n!=0 && (((n-1)%2)==0)){
			return " is indeed NOT an uneven number!";
		}else{
			return " is indeed an uneven number!";
		}
	}
}
