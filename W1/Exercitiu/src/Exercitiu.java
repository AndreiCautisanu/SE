
public class Exercitiu {

	public static void main(String[] args) {
		Paralelogram p = new Paralelogram();
		p.draw();
		
		Punct[] colturi = new Punct[4];
		for (int i = 0; i < 4; i++) {
			colturi[i] = new Punct();
		}
		
		colturi[0].x = 2;
		colturi[0].y = 5;
		
		colturi[1].x = 7;
		colturi[1].y = 2;
		
		colturi[2].x = 61;
		colturi[2].y = 12;
		
		colturi[3].x = 6;
		colturi[3].y = 5;
		
		Paralelogram cuColturi = new Paralelogram(colturi[0], colturi[1], colturi[2], colturi[3]);
		cuColturi.draw();
		
		Figura[] figuri = new Figura[3];
		figuri[0] = new Dreptunghi();
		Punct centru = new Punct(5, 4);
		figuri[1] = new Elipsa(10, 5, centru);
		figuri[2] = new Cerc(4, centru);
		
		for (int i = 0; i < 3; i++) {
			figuri[i].draw();
		}
	}

}
