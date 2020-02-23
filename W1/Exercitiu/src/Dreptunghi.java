public class Dreptunghi extends Paralelogram {
	
	public Dreptunghi() {
		Punct zero = new Punct(0, 0);
		
		colturi[0] = zero;
		colturi[1] = zero;
		colturi[2] = zero;
		colturi[3] = zero;
	}
	
	public Dreptunghi(Punct p1, Punct p2, Punct p3, Punct p4) {
		
		if ((p1.x == p3.x) && (p2.x == p4.x) && (p1.y == p2.y) && (p3.y == p4.y)) {
			colturi[0] = p1;
			colturi[1] = p2;
			colturi[2] = p3;
			colturi[3] = p4;
		}
			
		else {
			throw new IllegalArgumentException("nu e dreptunghi");
		}
	}
}
