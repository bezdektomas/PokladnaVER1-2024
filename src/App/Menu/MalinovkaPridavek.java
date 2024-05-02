package App.Menu;

import App.Produkt;

public class MalinovkaPridavek extends MenuDecorator {
    Produkt aktualni;
   
    public MalinovkaPridavek (Produkt fl) {
        aktualni = fl;
    }
   
    @Override
    public String getNazev(){
        return aktualni.getNazev() + " + Malinovka";
    }
    @Override
    public int cena() {
        return aktualni.cena() + 0;
    }
   
}