package parking;

import java.util.ArrayList;

public class Parcheggio {

	private ArrayList<Mezzo> mezzi;
	private int disponibilita;
	private int disponibilitaAuto;
	private int disponibilitaMoto;
	private int disponibilitaCamion;
	private double ricavo;
	
	
	public Parcheggio(int _disponibilitaAuto, int _disponibilitaMoto, int _disponibilitaCamion ) {
		
		this.disponibilitaAuto = _disponibilitaAuto;
		this.disponibilitaMoto = _disponibilitaMoto;
		this.disponibilitaCamion = _disponibilitaCamion;
		this.disponibilitaAuto = _disponibilitaAuto + _disponibilitaMoto + _disponibilitaCamion ;
		this.mezzi = new ArrayList<Mezzo>();
	}
	
	public int getDisponibilitaAuto() {
		return disponibilitaAuto;
	}
	
	public void setDisponibilitaAuto(int _disponibilitaAuto) {
		this.disponibilitaAuto = _disponibilitaAuto;
	}

	public ArrayList<Mezzo> getMezzi() {
		return mezzi;
	}

	public void setMezzi(ArrayList<Mezzo> mezzi) {
		this.mezzi = mezzi;
	}

	public int getDisponibilita() {
		return disponibilita;
	}

	public void setDisponibilita(int disponibilita) {
		this.disponibilita = disponibilita;
	}

	public int getDisponibilitaMoto() {
		return disponibilitaMoto;
	}

	public void setDisponibilitaMoto(int disponibilitaMoto) {
		this.disponibilitaMoto = disponibilitaMoto;
	}

	public int getDisponibilitaCamion() {
		return disponibilitaCamion;
	}

	public void setDisponibilitaCamion(int disponibilitaCamion) {
		this.disponibilitaCamion = disponibilitaCamion;
	}

	public double getRicavo() {
		return ricavo;
	}

	public void setRicavo(double ricavo) {
		this.ricavo = ricavo;
	}
	
	
}
