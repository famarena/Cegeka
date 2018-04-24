import java.time.LocalDateTime;

public class MainBiglietteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime ora = LocalDateTime.of(2018, 04, 19,  23, 45, 00);
		
		Spettacolo s = new Spettacolo("cavie", ora);
		Biglietto b1 = new Biglietto(s);
		Biglietteria b = new Biglietteria();
		Mascherina m = new Mascherina();
		
		Biglietto b2 = new Biglietto(s);
		
		b.biglietti.add(b1);
		b.biglietti.add(b2);
		
		b.vendiBiglietto(s, ora, 2);
		b.vendiBiglietto(s, ora, 2);
		b.vendiBiglietto(s, ora, 2);
		
		m.spettacoli.add(s);

		m.avvia(b1);
		
		
		Spettacolo s2 = new Spettacolo("Metropolis", ora);
		Spettacolo s3 = new Spettacolo("Oasis", ora);
		Biglietto b3 = new Biglietto(s3);

		

		m.spettacoli.add(s);
		m.mostrainfo(b1);
		m.mostrainfo(b2);
		m.mostrainfo(b3);

		
	}

}
