package gestionale.articoli;

import java.util.ArrayList;

public class Magazzino {
	
	public ArrayList<Articolo> articoli;

	public Magazzino() {
		this.articoli = new ArrayList<Articolo>();
		
	}

	
	public void rifornisciArticolo(int codice, int quantita, int prezzo) {
		
		Articolo a = new Articolo();
		
		for(Articolo art:articoli) 
		{
			if(art.getCodice()==codice) 
			{
				art.setQuantita(art.getQuantita()+quantita);
			}
			
			a.setCodice(codice);
			a.setQuantita(quantita);
			a.setPrezzo(prezzo);
		}
	}
	
	
	public int vendiArticolo(int codice, int quantita) {
		
		int res = 0;
		for(Articolo art:articoli)
		{
			if(articoli.size()>0)
			{
				if(art.getCodice()==codice)
				{
					if(art.getQuantita()>quantita) 
					{
					res = art.getQuantita()-quantita;
					art.setQuantita(res);
					System.out.print("venduto, rimangono: " + res);
					return res;
					}
					System.out.print("richiesta > disponibilita:"+ art.getQuantita());
				}
				
			}
			
		}
		return res;
	}
	
	
	public void aggiornaPrezzi(int percentuale) {
		
		for(Articolo a :articoli) {
			
			int res = (a.getPrezzo() *7 )/100;
			a.setPrezzo(res);
		}
	}
	
	
}
