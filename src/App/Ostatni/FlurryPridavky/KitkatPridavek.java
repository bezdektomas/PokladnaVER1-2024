package App.Ostatni.FlurryPridavky;

import App.Ostatni.OstatniDecorator;

import App.Produkt;

public class KitkatPridavek extends OstatniDecorator {
    Produkt aktualni;
   
    public KitkatPridavek (Produkt fl) {
        aktualni = fl;
    }
   
    @Override
    public String getNazev(){
        return aktualni.getNazev() + " + Kitkat";
    }
    @Override
    public int cena() {
        return aktualni.cena() + 0;
    }
   
}