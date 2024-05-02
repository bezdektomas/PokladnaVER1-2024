package App.Napoje;

import App.Produkt;

public class Cocacola extends Produkt {
    public Cocacola(){
        nazev = "CocaCola";
     }
    
     @Override
     public int cena() {
         return 39;
     }
}
