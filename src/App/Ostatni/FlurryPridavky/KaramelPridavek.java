package App.Ostatni.FlurryPridavky;

import App.Ostatni.OstatniDecorator;

import App.Produkt;

public class KaramelPridavek extends OstatniDecorator {
    Produkt aktualni;
   
    public KaramelPridavek (Produkt fl) {
        aktualni = fl;
    }
   
    @Override
    public String getNazev(){
        return aktualni.getNazev() + " + Karamelová poleva";
    }
    @Override
    public int cena() {
        return aktualni.cena() + 0;
    }
   
}