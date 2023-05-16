package abstractizare;

public interface Interfata1 {

    public static final int camp = 0;
    public abstract void simpleMethod();
    void complexMethod(String s);

    default void method(){
        afiseaza();
    }

    private void afiseaza() {
        System.out.println("metoda din Interfata 1");
    }

}
