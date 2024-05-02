package App.Menu;

import App.Produkt;

public class Bigmac extends Produkt {
    public Bigmac(){
        nazev = "Big Mac Menu";
     }
    
     @Override
     public int cena() {
         return 129;
     }
}
