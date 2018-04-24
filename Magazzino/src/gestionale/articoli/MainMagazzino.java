package gestionale.articoli;

public class MainMagazzino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Magazzino m = new Magazzino();
		
		Articolo a1 = new Articolo(01, "latte", 10, 1 );
		Articolo a2 = new Articolo(03, "caffe", 14, 3 );

		Magazzino m1 = new Magazzino();
		m1.articoli.add(a1);
		m1.articoli.add(a2);
		m1.vendiArticolo(01, 11);
		
		
		

	}

}
