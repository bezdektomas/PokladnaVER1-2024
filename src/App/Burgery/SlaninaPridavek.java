package App.Burgery;

import App.Produkt;

public class SlaninaPridavek extends BurgerDecorator {
    Produkt aktualni;
   
    public SlaninaPridavek (Produkt fl) {
        aktualni = fl;
    }
   
    @Override
    public String getNazev(){
        return aktualni.getNazev() + " + Slanina";
    }
    @Override
    public int cena() {
        return aktualni.cena() + 15;
    }
   
}