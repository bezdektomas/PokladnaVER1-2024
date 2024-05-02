package App.Napoje;

import App.Produkt;

public class Lipton extends Produkt {
    public Lipton(){
        nazev = "Lipton";
     }
    
     @Override
     public int cena() {
         return 39;
     }
}
