package App.Menu;

import App.Produkt;

public class Salat extends Produkt {
    public Salat(){
        nazev = "Salát Menu";
     }
    
     @Override
     public int cena() {
         return 129;
     }
}
