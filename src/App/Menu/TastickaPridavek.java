package App.Menu;

import App.Produkt;

public class TastickaPridavek extends MenuDecorator {
    Produkt aktualni;
   
    public TastickaPridavek (Produkt fl) {
        aktualni = fl;
    }
   
    @Override
    public String getNazev(){
        return aktualni.getNazev() + " + Taštička";
    }
    @Override
    public int cena() {
        return aktualni.cena() + 29;
    }
   
}