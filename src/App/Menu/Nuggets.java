package App.Menu;

import App.Produkt;

public class Nuggets extends Produkt {
    public Nuggets(){
        nazev = "McNugets Menu";
     }
    
     @Override
     public int cena() {
         return 129;
     }
}
