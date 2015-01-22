package forberedelseuppgifter2;

public class Forberedelse2D {

	public static void main(String[] args) {
		int n = 5;
		System.out.print(blanks(n));
		System.out.println("");
		System.out.println("There are "+n+" blank space(s) above this line. I promise.");
	}
	public static String blanks(int n){
		String x ="";

		while(n>0){
			x += " ";
			n--;
		}
		return x;
	}
}//Henrik Johansson ehioja-0 2015-January-22