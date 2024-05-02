package App.Napoje;

import App.Produkt;

public class Malinovka extends Produkt {
    public Malinovka(){
        nazev = "Malinovka";
     }
    
     @Override
     public int cena() {
         return 33;
     }
}
