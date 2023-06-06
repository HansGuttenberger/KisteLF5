
public class Kiste {
	
	int hoehe;
	int breite;
	int tiefe;
	String farbe;
	
	public int getVolume(){
		return this.hoehe * this.breite * this.tiefe;
	}
	public void getFarbe() {
		System.out.println(this.farbe);
	}
	
}

