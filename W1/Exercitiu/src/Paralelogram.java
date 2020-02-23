
public class Paralelogram extends Figura {
	Punct[] colturi = new Punct[4];
	
	public Paralelogram() {
		Punct[] puncte = new Punct[4];
		
		for (int i = 0; i < 4; i++) {
			puncte[i] = new Punct();
		}
		
		for (int i = 0; i < 4; i++) {
			puncte[i].x = 0;
			puncte[i].y = 0;
		}
		
		colturi = puncte;
	}
	
	public Paralelogram(Punct p1, Punct p2, Punct p3, Punct p4) {
		colturi[0] = p1;
		colturi[1] = p2;
		colturi[2] = p3;
		colturi[3] = p4;
	}
	
	public void draw() {
		System.out.printf("Colt 1: (%d, %d), Colt 2: (%d, %d), Colt 3: (%d, %d), Colt 4: (%d, %d)\n", colturi[0].x, colturi[0].y, colturi[1].x, colturi[1].y, colturi[2].x, colturi[2].y, colturi[3].x, colturi[3].y);
	}
}
