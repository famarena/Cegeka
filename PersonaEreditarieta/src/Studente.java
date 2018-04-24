
public class Studente extends Persona{
	
	String nome;
	String cognome;
	String eta;
	
	
	
	public Studente() {
		
	}
	

	
	public Studente(String nome, String cognome, String eta) {
		
		super(nome, cognome, eta);
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
