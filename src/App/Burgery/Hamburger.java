package App.Burgery;

import App.Produkt;

public class Hamburger extends Produkt {
    public Hamburger(){
        nazev = "Hamburger";
     }
    
     @Override
     public int cena() {
         return 33;
     }
}
