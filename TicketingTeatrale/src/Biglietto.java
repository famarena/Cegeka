import java.time.LocalDateTime;




public class Biglietto {
	
	private Spettacolo spettacolo;
	private LocalDateTime dataOra;
	private int iscritti;
	private int disponibilita = 5;
	
	
	public Biglietto() {
		
	}
	
	public Biglietto(Spettacolo spettacolo) {
		
		this.spettacolo=spettacolo;
		this.disponibilita=5;
		
	}
	
	public Spettacolo getSpettacolo() {
		return spettacolo;
	}
	public void setSpettacolo(Spettacolo spettacolo) {
		this.spettacolo = spettacolo;
	}
	public LocalDateTime getDataOra() {
		return dataOra;
	}
	public void setDataOra(LocalDateTime dataOra) {
		this.dataOra = dataOra;
	}
	public int getIscritti() {
		return iscritti;
	}
	public void setIscritti(int iscritti) {
		this.iscritti = iscritti;
	}
	public int getDisponibilita() {
		return disponibilita;
	}
	public void setDisponibilita(int disponibilita) {
		this.disponibilita = disponibilita;
	}
	
	
	
}
	


