package App.Ostatni.FlurryPridavky;

import App.Ostatni.OstatniDecorator;

import App.Produkt;

public class SnickersPridavek extends OstatniDecorator {
    Produkt aktualni;
   
    public SnickersPridavek (Produkt fl) {
        aktualni = fl;
    }
   
    @Override
    public String getNazev(){
        return aktualni.getNazev() + " + Snickers";
    }
    @Override
    public int cena() {
        return aktualni.cena() + 5;
    }
   
}