package App.Burgery;

import App.Produkt;

public class SyrPridavek extends BurgerDecorator {
    Produkt aktualni;
   
    public SyrPridavek (Produkt fl) {
        aktualni = fl;
    }
   
    @Override
    public String getNazev(){
        return aktualni.getNazev() + " + Sýr";
    }
    @Override
    public int cena() {
        return aktualni.cena() + 10;
    }
   
}