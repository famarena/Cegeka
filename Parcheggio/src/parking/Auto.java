package parking;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Auto extends Mezzo {
	

	public Auto(String targa) {
		super(targa);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void entra(LocalDateTime oraArrivo, Parcheggio p) {
		// TODO Auto-generated method stub
		if(p.getDisponibilitaAuto()>0){
			this.setOraArrivo(oraArrivo);
			p.getMezzi().add(this);
			p.setDisponibilitaAuto(p.getDisponibilitaAuto()-1);
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
			System.out.println("Ingresso: " + this.getOraArrivo().format(formatter));
		} 			
	}
	
	

	@Override
	public void esci(LocalDateTime oraUscita) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getInfo(Mezzo m) {
		// TODO Auto-generated method stub
		
	}

	

}
