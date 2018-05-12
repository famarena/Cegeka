package patterns.factoryMethod;

public class Commesso {
	
	// è l'implementazione della Factory: Commesso.class e le sue sottoclassi
	// Commesso = creator -> ha il compito di ritornare oggetto appropriato
	
	// CommG/CommT = ConcrCreat -> effettua l'overwrite del metodo per ritornare l'impl dell'oggetto
	public Scarpe getScarpe(String tipo) {
        Scarpe scarpe = null;
        if(tipo.equals("ginnastica"))
            scarpe = CommessoGinnastica.getScarpe();
        else if(tipo.equals("tennis"))
            scarpe = CommessoTennis.getScarpe();
        return scarpe;
    }
}
