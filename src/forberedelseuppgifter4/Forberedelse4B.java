package forberedelseuppgifter4;

public class Forberedelse4B {

	public static void main(String[] args) {
		Mjau2(10);
	}
	public static void Mjau2(int n){
		System.out.println("Mjau!");
		if(n>0){
			Mjau2(n-1);
		}
	}
}
