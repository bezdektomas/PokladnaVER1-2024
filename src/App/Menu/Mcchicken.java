package App.Menu;

import App.Produkt;

public class Mcchicken extends Produkt {
    public Mcchicken(){
        nazev = "McChicken Menu";
     }
    
     @Override
     public int cena() {
         return 129;
     }
}
