package patterns.factoryMethod;
public class CommessoTennis extends Commesso {
    public static Scarpe getScarpe(){
        return new ScarpeTennis();
    }
}