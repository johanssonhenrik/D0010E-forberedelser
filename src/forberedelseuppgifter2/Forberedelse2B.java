package forberedelseuppgifter2;

public class Forberedelse2B {

	public static void main(String[] args) {
		int n = 19453;
		System.out.println("The number sum of "+n+" is = "+siffersumma(n));
	}
	public static int siffersumma(int n){

		if(n==0){return 0;}
		System.out.println(n%10);
		return n % 10 + siffersumma(n/10);
	}
}//Henrik Johansson ehioja-0 2015-January-22
