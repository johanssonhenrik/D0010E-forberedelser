package forberedelseuppgifter2;

public class Forberedelse2A {
	
	int y;
	
	public static void main(String[] args) {
		int k = 7;
		System.out.println(k + "^2 is " + kvadratRekursiv(k));
	}
	
	public static int kvadratRekursiv(int k){

		if(k==0){
			return 0;
		}
		return kvadratRekursiv(k-1)+(k-1)+(k-1)+1;
	}
}//Henrik Johansson ehioja-0 2015-January-22