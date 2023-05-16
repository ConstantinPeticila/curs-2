package abstractizare;

public class Implementare implements Interfata1, Interfata2{
    @Override
    public void simpleMethod() {
        System.out.println("Metoda simpla");
    }

    @Override
    public void complexMethod(String s) {
        System.out.println("Metoda complexa: " + s);
    }

    @Override
    public void method() {
        Interfata2.super.method();
    }
}
