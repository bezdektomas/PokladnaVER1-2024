package App.Ostatni.FlurryPridavky;

import App.Ostatni.OstatniDecorator;

import App.Produkt;

public class LentilkyPridavek extends OstatniDecorator {
    Produkt aktualni;
   
    public LentilkyPridavek (Produkt fl) {
        aktualni = fl;
    }
   
    @Override
    public String getNazev(){
        return aktualni.getNazev() + " + Lentilky";
    }
    @Override
    public int cena() {
        return aktualni.cena() + 0;
    }
   
}