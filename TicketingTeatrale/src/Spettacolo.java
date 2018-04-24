import java.time.LocalDateTime;

public class Spettacolo {

	
	private LocalDateTime dataOra;
	private String nome;
	
	
	
	public Spettacolo(String nome, LocalDateTime dataOra) {
		
		this.nome = nome;
		this.dataOra = dataOra;
	}


	public LocalDateTime getDataOra() {
		return dataOra;
	}


	public void setDataOra(LocalDateTime dataOra) {
		this.dataOra = dataOra;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}
