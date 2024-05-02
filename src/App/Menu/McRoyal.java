package App.Menu;

import App.Produkt;

public class McRoyal extends Produkt {
    public McRoyal(){
        nazev = "McRoyal Menu";
     }
    
     @Override
     public int cena() {
         return 129;
     }
}
