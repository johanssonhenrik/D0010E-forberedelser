package forberedelseuppgifter2;

public class Forberedelse2A {
	
	public static void main(String[] args) {
		int k = 2;
		System.out.println("The square root of "+ k + " is " + kvadratRekursiv(k));
	}
//					16	   +  8	 + 1 = 25
//5^2 =[(4+1) = kvadrat(4) + 2*4 + 1]
	
	public static int kvadratRekursiv(int k){
		
		if(k==0){
			return k;
		}else{
			System.out.println(k);
			return kvadratRekursiv(k-1) + k + k + 1;
		}
	}
}