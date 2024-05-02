package App.Menu;

import App.Produkt;

public class SladkokyselaPridavek extends MenuDecorator {
    Produkt aktualni;
   
    public SladkokyselaPridavek (Produkt fl) {
        aktualni = fl;
    }
   
    @Override
    public String getNazev(){
        return aktualni.getNazev() + " + Sladkokyselá omáčka";
    }
    @Override
    public int cena() {
        return aktualni.cena() + 10;
    }
   
}