
public class start {

	public static void main(String[] args) {
		Kiste x = new Kiste();
		x.hoehe = 50;
		x.breite = 50;
		x.tiefe = 20;
		x.farbe = "pink";
		x.getFarbe();
		
		int volume = x.getVolume();
		
	}

}
