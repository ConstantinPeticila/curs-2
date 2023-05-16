package abstractizare;

public class Dreptunghi extends FormaGeometrica{

    public double latime;
    public Dreptunghi(double lungime, double latime) {
        super(lungime);
        this.latime = latime;
    }

    @Override
    public double getArie() {
        return latime*lungime;
    }

    @Override
    public double getPerimetru() {
        return 2*(lungime+latime);
    }
}
