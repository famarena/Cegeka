package patterns.factoryMethod;


public class Cliente {
	
	
    public static void main(String[] args) {
        Commesso commesso = new Commesso();
        Scarpe scarpe = commesso.getScarpe("ginnastica");
        
        // si creano degli oggetti senza conoscerne i dettagli, ma delegando un Creator
        //che in basse alle info (Stringa) saprà quale chiamare
        // ---> vedi classe commesso
        System.out.println(scarpe.getClass());
    }
}