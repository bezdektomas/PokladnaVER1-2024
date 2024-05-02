package App.Burgery;

import App.Produkt;

public class RajcePridavek extends BurgerDecorator {
    Produkt aktualni;
   
    public RajcePridavek (Produkt fl) {
        aktualni = fl;
    }
   
    @Override
    public String getNazev(){
        return aktualni.getNazev() + " + Rajče";
    }
    @Override
    public int cena() {
        return aktualni.cena() + 10;
    }
   
}