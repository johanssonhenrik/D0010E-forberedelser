package forberedelseuppgifter2;

public class Forberedelse2A {
	
	int y;
	
	public static void main(String[] args) {
		int k = 2;
		System.out.println("The square root of "+ k + " is " + kvadratRekursiv(k));
	}
//					16	   +  8	 + 1 = 25
//5^2 =[(4+1) = kvadrat(4) + 2*4 + 1]
	
	public static int kvadratRekursiv(int k){
		
		if(k==0){
			System.out.println(k + " END");
			return 0;
		}else{
			System.out.println(k);
			kvadratRekursiv(k); + k + k + 1
			k -= 1;
			return k;
		}
	}
}

//kvadratRekursiv(2-1) + 2 + 2 + 1;
//kvadratRekursiv(1-1) + 1 + 1 + 1;
//kvadratRekursiv(0-1) + 0 + 0 + 1;

//0-1 + 0 + 0 + 1 = 1
//1-1 + 1 + 1 + 1 = 3
//2-1 + 2 + 2 + 1 = 6