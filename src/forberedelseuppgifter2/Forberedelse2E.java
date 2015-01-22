package forberedelseuppgifter2;

public class Forberedelse2E {

	public static void main(String[] args) {
		System.out.println(change(9458));
	}
	public static String change(int n){
		
		int tens = 0;
		int fives = 0;
		int ones = 0;
		
		tens = tens + n/10;
		fives = (n%10)/5;
		ones = (n%5)/1;
		
		return "The amount of "+n+" can be split into "+tens+" ten(s), "+fives+" five(s), "+ones+" one(s)";
	}
}//Henrik Johansson ehioja-0 2015-January-22
