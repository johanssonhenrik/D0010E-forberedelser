package forberedelseuppgifter3;

public class Forberedelse3EHelikopterflykt {

	public static void main(String[] args) {

		Helicopter helikopter = new Helicopter("176");
		Helicopter polishelikopter = new Helicopter("Carlsson");
		
		helikopter.flyTo(30, 30);
		polishelikopter.flyTo(-30,-30);
		Helicopter.separation(helikopter,polishelikopter);
	}
}
