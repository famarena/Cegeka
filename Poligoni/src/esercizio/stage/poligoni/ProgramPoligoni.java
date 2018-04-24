package esercizio.stage.poligoni;


public class ProgramPoligoni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PoligonoRegolare p1 = new PoligonoRegolare();
		PoligonoRegolare p2 = new PoligonoRegolare();
		TriangoloEquilatero t1 = new TriangoloEquilatero(10);

		
		p1.getLato();
		t1.perimetro();
		
		System.out.println(t1.perimetro());
		
		PoligonoRegolare quad = new Quadrato();
		


	}

}
