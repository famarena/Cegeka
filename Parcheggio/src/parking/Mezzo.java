package parking;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public abstract class Mezzo {
	
	private String targa;
	private LocalDateTime oraArrivo;
	private LocalDateTime oraUscita;
	private int MyTime;

	
	public Mezzo(String targa) {
		
		this.targa = targa;
	}
	
public abstract void entra(LocalDateTime oraArrivo, Parcheggio p);
public abstract void esci(LocalDateTime oraUscita);
public abstract void getInfo(Mezzo m);
public static int myTime(LocalDateTime arrivo, LocalDateTime uscita) {
	
	LocalDateTime tempDateTime = LocalDateTime.from( arrivo );
	int hours =  (int) tempDateTime.until(uscita, ChronoUnit.HOURS);
	System.out.print(hours);
	
	return hours;
}
	
	public String getTarga() {
		return this.targa;
	}
	
	public void setTarga(String _targa) {
		this.targa = _targa;
	}

	public LocalDateTime getOraArrivo() {
		return oraArrivo;
	}

	public void setOraArrivo(LocalDateTime oraArrivo) {
		this.oraArrivo = oraArrivo;
	}
	
	public LocalDateTime getOraUscita() {
		return this.oraUscita;
	}
	
	public void setOraUscita(LocalDateTime _oraUscita) {
		this.oraUscita = _oraUscita;
	}

	public int getMyTime() {
		return MyTime;
	}

	public void setMyTime(int myTime) {
		MyTime = myTime;
	}

	public void getInfo(Auto m) {
		// TODO Auto-generated method stub
		
	}
	
	
}
