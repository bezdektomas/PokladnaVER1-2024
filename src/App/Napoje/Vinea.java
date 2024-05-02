package App.Napoje;

import App.Produkt;

public class Vinea extends Produkt {
    public Vinea(){
        nazev = "Vinea";
     }
    
     @Override
     public int cena() {
         return 33;
     }
}
