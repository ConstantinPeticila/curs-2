package exceptii;

public class ImpartireIlegalaException extends Exception {

    public ImpartireIlegalaException(String message) {
        super(message);
        System.out.println("s-a apelat constructorul");
    }
}
