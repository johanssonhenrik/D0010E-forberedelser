package forberedelseuppgifter3;

public class Forberedelse3B {

	public static void main(String[] args) {
		String s = "Nudlar är helt okej";
		char bad = 'r';
		System.out.println("Om man tar bort '"+bad+"' från meningen '"+s+"' så får man '"+beautify(s,bad)+"'");
	}
	public static String beautify(String s, char bad){
		int i;
		String answer ="";
		for(i=0; i<s.length(); i++){
			if(s.charAt(i)==bad){
				continue;
			}else if(s.length()!=0){
				answer = answer + String.valueOf(s.charAt(i));
			}
		}
		return answer;
	}
}
