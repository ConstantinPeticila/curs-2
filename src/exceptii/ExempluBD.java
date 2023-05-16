package exceptii;

import java.sql.Connection;

public class ExempluBD {

    public static void main(String[] args) {
//        ConexiuneBD c = null;
        try(ConexiuneBD conexiune = new ConexiuneBD()) {
            conexiune.simuleazaUtilizare();
        } catch (Exception e) {
            System.out.println("s-a aruncat exceptie");
        }
       /* finally {
            if(c != null){
                c.close();
            }
        }*/
    }
}
