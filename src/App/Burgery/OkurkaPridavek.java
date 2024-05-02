package App.Burgery;

import App.Produkt;

public class OkurkaPridavek extends BurgerDecorator {
    Produkt aktualni;
   
    public OkurkaPridavek (Produkt fl) {
        aktualni = fl;
    }
   
    @Override
    public String getNazev(){
        return aktualni.getNazev() + " + Okurka";
    }
    @Override
    public int cena() {
        return aktualni.cena() + 10;
    }
   
}