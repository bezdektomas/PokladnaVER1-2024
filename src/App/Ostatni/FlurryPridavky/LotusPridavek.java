package App.Ostatni.FlurryPridavky;

import App.Ostatni.OstatniDecorator;

import App.Produkt;

public class LotusPridavek extends OstatniDecorator {
    Produkt aktualni;
   
    public LotusPridavek (Produkt fl) {
        aktualni = fl;
    }
   
    @Override
    public String getNazev(){
        return aktualni.getNazev() + " + Lotus";
    }
    @Override
    public int cena() {
        return aktualni.cena() + 0;
    }
   
}