package exceptii;

public class ConexiuneBD implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("s-a apelat mecanismul de inchidere a resursei");
    }

    public void simuleazaUtilizare() throws Exception {
        System.out.println("se utilizeaza resursa");
        throw new Exception("se arunca exceptie");
    }
}
