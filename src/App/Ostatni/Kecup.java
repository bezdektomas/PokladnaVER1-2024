package App.Ostatni;

import App.Produkt;

public class Kecup extends Produkt {
    public Kecup(){
        nazev = "Kečup";
     }
    
     @Override
     public int cena() {
         return 5;
     }
}
