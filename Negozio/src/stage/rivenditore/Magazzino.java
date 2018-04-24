package stage.rivenditore;

import java.util.ArrayList;



public class Magazzino {
	
	private ArrayList<Articolo> articoli;
	
	
	public Magazzino(ArrayList<Articolo> articoli) {
		// TODO Auto-generated constructor stub
		this.articoli = articoli;
	}
	
	/*
	
	public int conteggiaArticoli(String prefisso) {
		
		
		
	
		int x = 0;
		for(int i = 0; i>articoli.size();i++) {
		x+=1;
		}
		System.out.print(x);
		return x;
		
	}
	*/
	
	public void rifornisciArticolo(String codice, int quantita) {
		
		Articolo r = new Articolo();
		for(Articolo a :this.articoli) {
			if(a.disponibilita>=1) 
			{
				a.setDisponibilita(a.disponibilita + quantita);	
			}
			if(a.disponibilita==0)
			{
				r.setCodice(codice);
				r.setDisponibilita(quantita);
				
			}		
		}	
	}
	
	
	public Articolo vendiArticolo(String _codice) {
		
		
		Articolo art = new Articolo();
		
		if(this.articoli.size()>0)
		{
			for(Articolo a :this.articoli)
			{
				if(a.getCodice().equals(_codice))
				{
					if(a.getDisponibilita()>0)
					{
						int res = a.getDisponibilita() -1;
						a.setDisponibilita(res);
						System.out.println("venduto");
						return a;
					} 
				}	
				
				else System.out.println("non ci sono articoli con quel codice");
				return art;
			}
		} else System.out.println("non ci sono articoli");
		return art;
	}
	public void rifornisciArticolo(Articolo articolo) {
		
		articoli.add(articolo);
			
	}
	
	
	public void aggiornaPrezzi(int percentuale) {
		
		for(Articolo a: articoli) {
			a.setPrezzo((a.prezzo/100)*percentuale);
			System.out.println(a.prezzo);
		}
		
	}
	
	public int conteggiaArticoli(String prefisso) {
		int x =0;
		for(Articolo a : articoli) {
			
			if(a.getCodice().startsWith("0"))
			{
				x+=1;
				
			}
		}
		return x;
	}
}
