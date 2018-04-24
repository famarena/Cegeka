import java.time.LocalDateTime;
import java.util.ArrayList;



public class Biglietteria {
	
	ArrayList<Biglietto> biglietti;
	private Spettacolo spettacolo;
 	
	public Biglietteria() {
		
		this.biglietti=new ArrayList<Biglietto>();
		
	}
 	
 	
 	
 	
 	
	public int vendiBiglietto(Spettacolo spettacolo, LocalDateTime dataOra, int qta) { 
		
	
	Biglietto bb = new Biglietto();
	
	int res = 0;
	for(Biglietto b:biglietti)
	{
		if(biglietti.size()>0)
		{
			if(b.getSpettacolo().getNome().equals(spettacolo.getNome())) {
				if(b.getDisponibilita()>=qta) 
				{
						res = b.getDisponibilita()-qta;
						b.setDisponibilita(res);
						b.setDataOra(dataOra);
						System.out.println("venduto, rimangono: " + res);
						return res;
				}
					System.out.println("richiesta è maggiore della disponibilita:"+ b.getDisponibilita());
				
			}
			
		}
		
	}
	return res;
}





	public ArrayList<Biglietto> getBiglietti() {
		return biglietti;
	}





	public void setBiglietti(ArrayList<Biglietto> biglietti) {
		this.biglietti = biglietti;
	}





	public Spettacolo getSpettacolo() {
		return spettacolo;
	}





	public void setSpettacolo(Spettacolo spettacolo) {
		this.spettacolo = spettacolo;
	}
 	
 	
 
}

 
