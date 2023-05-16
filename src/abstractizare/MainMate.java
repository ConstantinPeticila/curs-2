package abstractizare;

import java.text.Normalizer;

public class MainMate {

    public static void main(String[] args) {
        FormaGeometrica cerc = new Cerc(10);
        FormaGeometrica dreptunghi = new Dreptunghi(10,5);
        System.out.println(cerc.getArie());
        System.out.println(dreptunghi.getArie());

        FormaGeometrica formaUnica = new FormaGeometrica(10) {
            @Override
            public double getArie() {
                return lungime*lungime;
            }

            @Override
            public double getPerimetru() {
                return 0;
            }
        };
    }
}
