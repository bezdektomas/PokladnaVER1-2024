package App.Ostatni.FlurryPridavky;

import App.Ostatni.OstatniDecorator;

import App.Produkt;

public class BoruvkyPridavek extends OstatniDecorator {
    Produkt aktualni;
   
    public BoruvkyPridavek (Produkt fl) {
        aktualni = fl;
    }
   
    @Override
    public String getNazev(){
        return aktualni.getNazev() + " + Borůvková poleva";
    }
    @Override
    public int cena() {
        return aktualni.cena() + 0;
    }
   
}