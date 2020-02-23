
public class Elipsa extends Figura {
	int raza1, raza2;
	Punct centru = new Punct();
	
	public Elipsa() {
		centru.x = 0;
		centru.y = 0;
		raza1 = 0;
		raza2 = 0;
	}
	
	public Elipsa(int raza1, int raza2, Punct centru) {
		this.raza1 = raza1;
		this.raza2 = raza2;
		this.centru = centru;
	}
	
	public void draw() {
		System.out.printf("Centru: (%d, %d); Raza 1 = %d, Raza 2 = %d\n", centru.x, centru.y, raza1, raza2);
	}
}
