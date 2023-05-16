package abstractizare;

public abstract class FormaGeometrica {

    public double lungime;

    public FormaGeometrica(double lungime) {
        this.lungime = lungime;
    }

    public abstract double getArie();
    public abstract double getPerimetru();
}
