package App.Menu;

import App.Produkt;

public class SalatPridavek extends MenuDecorator {
    Produkt aktualni;
   
    public SalatPridavek (Produkt fl) {
        aktualni = fl;
    }
   
    @Override
    public String getNazev(){
        return aktualni.getNazev() + " + Salát";
    }
    @Override
    public int cena() {
        return aktualni.cena() + 0;
    }
   
}