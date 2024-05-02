package App.Ostatni.FlurryPridavky;

import App.Ostatni.OstatniDecorator;

import App.Produkt;

public class JahodaPridavek extends OstatniDecorator {
    Produkt aktualni;
   
    public JahodaPridavek (Produkt fl) {
        aktualni = fl;
    }
   
    @Override
    public String getNazev(){
        return aktualni.getNazev() + " + Jahodová poleva";
    }
    @Override
    public int cena() {
        return aktualni.cena() + 0;
    }
   
}