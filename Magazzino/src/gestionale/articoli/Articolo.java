package gestionale.articoli;

public class Articolo {
	
	public int codice;
	public String nome;
	public int quantita;
	public int prezzo;
	
	public Articolo() {}

	public Articolo(int codice, String nome, int quantita, int prezzo) {
		
		this.codice=codice;
		this.nome=nome;
		this.quantita = quantita;
		this.prezzo= prezzo;
	}
	
	public int getCodice() {
		return this.codice;
	}
	
	public void setCodice(int codice) {
		this.codice=codice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
	
}
