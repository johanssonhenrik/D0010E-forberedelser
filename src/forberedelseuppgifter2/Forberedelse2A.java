package forberedelseuppgifter2;

public class Forberedelse2A {
	
	public static void main(String[] args) {
		int k = 4;
		System.out.println("The square root of "+ k + " is " + kvadratRekursiv(k));
	}

	//(4+1) = kvadrat(5) + 2*5 + 1
	
	public static int kvadratRekursiv(int k){
		int x = 0;
		k = k + x;
		
		if(k == 0){
			return k;
		}else{
			x = k - x + 1;
			System.out.println(k);
			kvadratRekursiv(k-1);
		}
		return k;
	}
}

1 4 9 16 25