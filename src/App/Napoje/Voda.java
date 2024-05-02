package App.Napoje;

import App.Produkt;

public class Voda extends Produkt {
    public Voda(){
        nazev = "Voda";
     }
    
     @Override
     public int cena() {
         return 29;
     }
}
