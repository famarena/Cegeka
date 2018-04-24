import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Mascherina {

	ArrayList<Spettacolo> spettacoli;
	
	public Mascherina() {
		
		this.spettacoli= new ArrayList<Spettacolo>();
	}
	
	public void mostrainfo(Biglietto b) {
		
			System.out.print("Spettacolo: '" + b.getSpettacolo().getNome());
			System.out.print("';  Biglietti disponibili: " + b.getDisponibilita() );

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
			System.out.println("; Data e ora: " + b.getSpettacolo().getDataOra().format(formatter));
		
	}
	
	
	public void avvia(Biglietto bi) {
		
	Boolean check = false;	
		String nome= bi.getSpettacolo().getNome();
		int disp= bi.getDisponibilita();
		for(Spettacolo sp:spettacoli) 
		{
			if(sp.getNome().equals(nome))
			{
				if(bi.getDisponibilita()<=3)
				{
					
					System.out.println("ok, lo spettacolo puo iniziare!!");
					spettacoli.remove(sp);
					check= true;
					break;
				}
				else 
				{
					System.out.println("non sono stati venduti abbastanza biglietti! disponibilita: " +
					bi.getDisponibilita());	
				}
				}
			else 
			{
				System.out.print("non è in programma questo spettacolo.")	;	

			}
		}
	}
}
