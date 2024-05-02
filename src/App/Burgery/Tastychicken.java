package App.Burgery;

import App.Produkt;

public class Tastychicken extends Produkt {
    public Tastychicken(){
        nazev = "Tasty Chicken";
     }
    
     @Override
     public int cena() {
         return 39;
     }
}
