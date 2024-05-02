package App.Ostatni;

import App.Produkt;

public class Tasticka extends Produkt {
    public Tasticka(){
        nazev = "Taštička";
     }
    
     @Override
     public int cena() {
         return 29;
     }
}
