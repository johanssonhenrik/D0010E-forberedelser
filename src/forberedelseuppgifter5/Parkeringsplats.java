package forberedelseuppgifter5;

//import bonusuppgift5.Bil;

public class Parkeringsplats {

	private boolean parkeringsPlatsLedig;
	private int parkeringsNummer = 0;
	
	public static void main(String[] args) {

		
		
	}
	public Parkeringsplats(int parkeringsNummer, boolean parkeringsPlatsLedig){
		this.parkeringsNummer = parkeringsNummer + 1;
		this.parkeringsPlatsLedig = false;
	}
	public boolean upptagen(){
		return this.parkeringsPlatsLedig;
	}
//	public void parkeraPå(Bil bil){
//		this.parkeringsPlatsLedig = false;
//	}
	public void lämna(){
		this.parkeringsPlatsLedig = true;
	}
	public int nummer(){
		return this.parkeringsNummer;
	}
}