package App.Menu;

import App.Produkt;

public class KecupPridavek extends MenuDecorator {
    Produkt aktualni;
   
    public KecupPridavek (Produkt fl) {
        aktualni = fl;
    }
   
    @Override
    public String getNazev(){
        return aktualni.getNazev() + " + Kečup";
    }
    @Override
    public int cena() {
        return aktualni.cena() + 8;
    }
   
}