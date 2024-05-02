package App.Napoje;

import App.Produkt;

public class LedPridavek extends NapojeDecorator {
    Produkt aktualni;
   
    public LedPridavek (Produkt fl) {
        aktualni = fl;
    }
   
    @Override
    public String getNazev(){
        return aktualni.getNazev() + " + Bez ledu";
    }
    @Override
    public int cena() {
        return aktualni.cena() + 0;
    }
   
}