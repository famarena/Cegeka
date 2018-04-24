package rifornimento.auto;

public class Car {
	
	private String nome;
	private int kml;
	private int gasPresente;
	private Enum Carburante;
	
	public Car(String _nome, int _kml, Enum _carb) {
		this.nome = _nome;
		this.kml = _kml;
		this.Carburante = _carb;
		this.gasPresente = 0;
	}

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getKml() {
		return kml;
	}
	public void setKml(int kml) {
		this.kml = kml;
	}
	public Enum getCarburante() {
		return Carburante;
	}
	public void setCarburante(Enum _carb) {
		this.Carburante = _carb;
	}
	public int getGasPresente() {
		return gasPresente;
	}
	public void setGasPresente(int gasPresente) {
		this.gasPresente = gasPresente;
	}
	
	public void drive(int km) {
		
		if(this.gasPresente > 0) 
		{
			this.setGasPresente(this.gasPresente - (this.kml * km));
			System.out.println("rimangono l " + this.getGasPresente());
		}
		else
		{
			System.out.println("rifornire");

		}
	}
	
	public void getGas(int qta) {
		
		this.setGasPresente(qta + this.gasPresente);
		System.out.println("dopo rifornimento l " + this.gasPresente);
	}
	
	public Boolean isDiesel(String nome) {
		
		if(this.getCarburante().equals(Carburante)) {
			System.out.println("si, " + this.getCarburante());
			return true;
		} else
			System.out.println("no, " + this.getCarburante());
			return false;
	}
}
