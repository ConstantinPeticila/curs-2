package exceptii;

import java.util.Objects;

public class User {

    private String nume;
    private int varsta;

    public User(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        User user = (User) o;
        return varsta == user.varsta && Objects.equals(nume, user.nume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, varsta);
    }
    /* @Override
    public String toString(){
        return "User cu nume: " + this.nume + " si varsta " + this.varsta;
    }*/

    @Override
    public String toString() {
        return "User{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}
