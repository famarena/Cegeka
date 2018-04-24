package rifornimento.auto;

import java.util.ArrayList;

public class Concessionaria {

	private ArrayList<Car> cars;
	private int nCars;
	
	public Concessionaria(){
		
		this.cars = new ArrayList<Car>();
		
	}
	
	public ArrayList<Car> getCars() {
		return cars;
	}
	public void setCars(ArrayList<Car> cars) {
		this.cars = cars;
	}
	public int getnCars() {
		return nCars;
	}
	public void setnCars(int nCars) {
		this.nCars = nCars;
	}
	
	public void tutte() {
		for(Car c : cars) {
			System.out.print(c.getNome() +" "+ c.getKml() + "lkm, "+ c.getCarburante());
		}
	}
		
	public void aggiungiAuto(Car c) {
		
		cars.add(c);
		
	}
	
	public  void vendi(Car car) {
		
		Boolean check=true;
		for(Car c : cars) 
		{
			if(c.getNome().equals(car.getNome())) 
				{
					cars.remove(c);
					check=true;
					break;
				}  
				if(!check) 
				{
					System.out.println("non disponibile");
				}
		}
		
	}
	
	
	
	
}
