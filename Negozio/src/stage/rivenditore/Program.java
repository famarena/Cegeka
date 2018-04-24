package stage.rivenditore;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		Articolo art = new Articolo("01", 12, 2 );
		Articolo a1 =new Articolo("02", 12, 2 );
		Articolo a2 = new Articolo("03", 12, 2 );
		Articolo a3 = new Articolo("01", 12, 2 );
		Articolo a4 = new Articolo("01", 12, 2 );
		
		ArrayList<Articolo> articoli = new ArrayList<Articolo>();
		
		articoli.add(a2);
		articoli.add(art);
		articoli.add(a1);
		articoli.add(a3);
		articoli.add(a4);
		

		
		Magazzino m = new Magazzino(articoli);
		
		m.aggiornaPrezzi(10);
		m.vendiArticolo("03");
		 m.conteggiaArticoli("01");
	//	System.out.print(a.getPrezzo());
		m.aggiornaPrezzi(10);
		
	
			
	
		
		
			
	}

}
