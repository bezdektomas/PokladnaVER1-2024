package App.Burgery;

import App.Produkt;

public class Tastycheese extends Produkt {
    public Tastycheese(){
        nazev = "Tasty Cheese";
     }
    
     @Override
     public int cena() {
         return 39;
     }
}
