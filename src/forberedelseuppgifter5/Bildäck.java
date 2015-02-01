package forberedelseuppgifter5;

public class Bild�ck {

	private String tillverkare;
	private int bredd;
	private int h�jd;
	private int f�lgdiameter;
	private boolean punkterat;
	
	public static void main(String[] args) {
		Bild�ck d�ckEtt = new Bild�ck("Michelin",195,65,15);
		System.out.println(d�ckEtt);
		Bild�ck d�ckTv� = new Bild�ck("Pirelli",165,45,17);
		System.out.println(d�ckTv�);
		Bild�ck d�ckTre = new Bild�ck("GoodYear",205,65,22);
		System.out.println(d�ckTre);
	}
	public Bild�ck(String tillverkare,int bredd,int h�jd,int f�lgdiameter){
		this.tillverkare = tillverkare;
		this.bredd = bredd;
		this.h�jd = h�jd;
		this.f�lgdiameter = f�lgdiameter;
		this.punkterat = false;
	}
	public String toString(){
		return bredd+"/"+h�jd+" R "+f�lgdiameter+" "+tillverkare;
	}
	public String �rDetPunkterat(){
		if(punkterat){
			return "D�cket �r punkterat";
		}else{
			return "D�cket �r inte punkterat";
		}
	}
}
