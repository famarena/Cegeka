package rifornimento.auto;

public class Program {

	public static void main(String[] args) {


		Car golf = new Car("golf", 2, Carburante.diesel);
		Car polo = new Car("polo", 1, Carburante.gpl);
		
		golf.drive(20);
		golf.getGas(200);
		golf.drive(5);
		polo.getGas(100);
		polo.drive(5);
		golf.getGas(3);
		
		Concessionaria c = new Concessionaria();
		c.aggiungiAuto(polo);
		c.aggiungiAuto(golf);
		c.vendi(golf);
		c.tutte();
		
	}

}
