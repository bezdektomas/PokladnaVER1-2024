package App.Menu;

import App.Produkt;

public class SpritePridavek extends MenuDecorator {
    Produkt aktualni;
   
    public SpritePridavek (Produkt fl) {
        aktualni = fl;
    }
   
    @Override
    public String getNazev(){
        return aktualni.getNazev() + " + Sprite";
    }
    @Override
    public int cena() {
        return aktualni.cena() + 0;
    }
   
}