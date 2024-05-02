package App.Burgery;

import App.Produkt;

public class Cheeseburger extends Produkt {
    public Cheeseburger(){
        nazev = "CheeseBurger";
     }
    
     @Override
     public int cena() {
         return 33;
     }
}
