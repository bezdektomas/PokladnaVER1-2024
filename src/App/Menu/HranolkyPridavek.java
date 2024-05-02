package App.Menu;

import App.Produkt;

public class HranolkyPridavek extends MenuDecorator {
    Produkt aktualni;
   
    public HranolkyPridavek (Produkt fl) {
        aktualni = fl;
    }
   
    @Override
    public String getNazev(){
        return aktualni.getNazev() + " + Hranolky";
    }
    @Override
    public int cena() {
        return aktualni.cena() + 0;
    }
   
}