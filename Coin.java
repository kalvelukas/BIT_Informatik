package src.classes.informatik1;

public class Coin {

    private static final int ADD_MORE_COIN = 10;
    private int coin;
    private static Coin instance = new Coin(); // Eagerly Loading of singleton instance

    private Coin(){
        // private to prevent anyone else from instantiating
    }

    public static Coin getInstance() {
        return instance;
    }

    public int getCoin() {
        return coin;
    }

    public void addMoreCoin() {
        coin += ADD_MORE_COIN;
    }

    public void deductCoin() {
        coin--;
    }
}
