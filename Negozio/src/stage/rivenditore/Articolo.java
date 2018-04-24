package stage.rivenditore;

import java.util.ArrayList;




public class Articolo {

	String codice;
	String articolo;
	int prezzo;
	int disponibilita;
	private ArrayList<Articolo> listArt;
	
	
	public Articolo() {
		
	}
	
	public Articolo(String codice, int prezzo, int disponibilita) {
		this.codice = codice;
		this.prezzo = prezzo;
		this.disponibilita= disponibilita;
		
	}
	
	

	public String getArticolo() {
		return articolo;
	}

	public void setArticolo(String articolo) {
		this.articolo = articolo;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

	public int getDisponibilita() {
		return disponibilita;
	}

	public void setDisponibilita(int disponibilita) {
		this.disponibilita = disponibilita;
	}

	public ArrayList<Articolo> getListArt() {
		return listArt;
	}

	public void setListArt(ArrayList<Articolo> listArt) {
		this.listArt = listArt;
	}
	
	
	
	
	
	
}
