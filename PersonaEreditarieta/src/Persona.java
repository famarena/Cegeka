
public class Persona {
	
	protected String nome;
	protected String cognome;
	protected String eta;


	public Persona() {
		
	}
	
	public Persona(String nome, String cognome, String eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEta() {
		return eta;
	}

	public void setEta(String eta) {
		this.eta = eta;
	}

	
	public void getInfo(String _nome) {
		
		if(this.getNome().equals(nome))
		{
			System.out.println(this.getNome()+ this.getCognome() + this.getEta());
		} 
		else
			System.out.println("not found");
		}

}
