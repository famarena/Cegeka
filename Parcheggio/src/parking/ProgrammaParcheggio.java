package parking;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ProgrammaParcheggio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Parcheggio p1 = new Parcheggio(100, 20, 5);
		Auto a = new Auto("01");
		
		//a.entra(10,30);
		LocalDateTime arrivo = LocalDateTime.of(2018, 04, 19,  23, 45, 00);
		LocalDateTime uscita = LocalDateTime.now(ZoneId.systemDefault());
    //    int period = myTime(arrivo, uscita);

		a.entra(arrivo, p1);
	}
	
	

}
