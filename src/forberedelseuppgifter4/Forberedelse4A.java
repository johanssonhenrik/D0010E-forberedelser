package forberedelseuppgifter4;

public class Forberedelse4A {

	public static void main(String[] args) {
		int a = 3;
		int b = 7;
		System.out.println(max(a,b));
	}
	static int max(int a, int b){
		int biggest = (a>b) ? a : b;
		return biggest;
	}
}
