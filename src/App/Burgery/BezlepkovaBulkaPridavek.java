package App.Burgery;

import App.Produkt;

public class BezlepkovaBulkaPridavek extends BurgerDecorator {
    Produkt aktualni;
   
    public BezlepkovaBulkaPridavek (Produkt fl) {
        aktualni = fl;
    }
   
    @Override
    public String getNazev(){
        return aktualni.getNazev() + " + Bezlepková bulka";
    }
    @Override
    public int cena() {
        return aktualni.cena() + 15;
    }
   
}