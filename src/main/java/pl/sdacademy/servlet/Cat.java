package pl.sdacademy.servlet;

import java.util.Objects;

public class Cat {
    String rasa;
    String imie;
    String wlasciciel;

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getWlasciciel() {
        return wlasciciel;
    }

    public void setWlasciciel(String wlasciciel) {
        this.wlasciciel = wlasciciel;
    }

    public Cat(String rasa, String imie, String wlasciciel) {
        this.rasa = rasa;
        this.imie = imie;
        this.wlasciciel = wlasciciel;
    }

    public Cat() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(rasa, cat.rasa) &&
                Objects.equals(imie, cat.imie) &&
                Objects.equals(wlasciciel, cat.wlasciciel);
    }

    @Override
    public int hashCode() {

        return Objects.hash(rasa, imie, wlasciciel);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "rasa='" + rasa + '\'' +
                ", imie='" + imie + '\'' +
                ", wlasciciel='" + wlasciciel + '\'' +
                '}';
    }
}
