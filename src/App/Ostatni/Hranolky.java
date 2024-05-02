package App.Ostatni;

import App.Produkt;

public class Hranolky extends Produkt {
    public Hranolky(){
        nazev = "Hranolky";
     }
    
     @Override
     public int cena() {
         return 35;
     }
}
