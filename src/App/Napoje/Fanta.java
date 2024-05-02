package App.Napoje;

import App.Produkt;

public class Fanta extends Produkt {
    public Fanta(){
        nazev = "Fanta";
     }
    
     @Override
     public int cena() {
         return 39;
     }
}
