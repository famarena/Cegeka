package esercizio.stage.poligoni;

public class PoligonoRegolare {
	
	int nlati;
	int lato;
	
	public PoligonoRegolare() {
		
	}
	
	public PoligonoRegolare(int nlati, int lato) {
		this.nlati = nlati;
		this.lato = lato;
	}
	

	
	public void stampaNumeroLati(PoligonoRegolare poligono) {
		System.out.println("Io ho " + poligono.nlati + " lati" );
	}
	
	public void getInfo(PoligonoRegolare poligono) {
		
		System.out.println();
	}

	public String toString() {
		return "Lato->" + this.lato + " Numero lati -> " + this.nlati ;
	}

	public int getNlati() {
		return nlati;
	}

	public void setNlati(int nlati) {
		this.nlati = nlati;
	}

	public double getLato() {
		return lato;
	}

	public void setLato(int lato) {
		this.lato = lato;
	}

	
}
