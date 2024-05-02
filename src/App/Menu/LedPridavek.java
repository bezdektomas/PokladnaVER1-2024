package App.Menu;

import App.Produkt;

public class LedPridavek extends MenuDecorator {
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