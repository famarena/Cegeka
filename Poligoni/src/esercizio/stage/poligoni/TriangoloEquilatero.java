package esercizio.stage.poligoni;

public class TriangoloEquilatero extends PoligonoRegolare implements Calcolatore{
	
	int altezza;

	
	public TriangoloEquilatero() {
	}

	public TriangoloEquilatero(int lato) {
		super();
		this.nlati = 3;
		this.lato = lato;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		int p = lato * nlati;
		return p;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return lato * lato;
	}
	
	
}
