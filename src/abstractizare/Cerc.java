package abstractizare;

public class Cerc extends FormaGeometrica{


    public Cerc(double raza) {
        super(raza);
    }

    @Override
    public double getArie() {
        return Math.PI*lungime*lungime;
    }

    @Override
    public double getPerimetru() {
        return 2*Math.PI*lungime;
    }
}
