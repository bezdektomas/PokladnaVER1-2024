package App.Menu;

import App.Produkt;

public class CocacolaPridavek extends MenuDecorator {
    Produkt aktualni;
   
    public CocacolaPridavek (Produkt fl) {
        aktualni = fl;
    }
   
    @Override
    public String getNazev(){
        return aktualni.getNazev() + " + CocaCola";
    }
    @Override
    public int cena() {
        return aktualni.cena() + 0;
    }
   
}