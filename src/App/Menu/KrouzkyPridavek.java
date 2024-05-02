package App.Menu;

import App.Produkt;

public class KrouzkyPridavek extends MenuDecorator {
    Produkt aktualni;
   
    public KrouzkyPridavek (Produkt fl) {
        aktualni = fl;
    }
   
    @Override
    public String getNazev(){
        return aktualni.getNazev() + " + Sýrové kroužky";
    }
    @Override
    public int cena() {
        return aktualni.cena() + 39;
    }
   
}