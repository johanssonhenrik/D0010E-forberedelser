package forberedelseuppgifter5;

public class Bildäck {

	private String tillverkare;
	private int bredd;
	private int höjd;
	private int fälgdiameter;
	private boolean punkterat;
	
	public static void main(String[] args) {
		Bildäck däckEtt = new Bildäck("Michelin",195,65,15);
		System.out.println(däckEtt);
		Bildäck däckTvå = new Bildäck("Pirelli",165,45,17);
		System.out.println(däckTvå);
		Bildäck däckTre = new Bildäck("GoodYear",205,65,22);
		System.out.println(däckTre);
	}
	public Bildäck(String tillverkare,int bredd,int höjd,int fälgdiameter){
		this.tillverkare = tillverkare;
		this.bredd = bredd;
		this.höjd = höjd;
		this.fälgdiameter = fälgdiameter;
		this.punkterat = false;
	}
	public String toString(){
		return bredd+"/"+höjd+" R "+fälgdiameter+" "+tillverkare;
	}
	public String ärDetPunkterat(){
		if(punkterat){
			return "Däcket är punkterat";
		}else{
			return "Däcket är inte punkterat";
		}
	}
}
