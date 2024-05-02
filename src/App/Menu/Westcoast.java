package App.Menu;

import App.Produkt;

public class Westcoast extends Produkt {
    public Westcoast(){
        nazev = "West Coast Menu";
     }
    
     @Override
     public int cena() {
         return 169;
     }
}
