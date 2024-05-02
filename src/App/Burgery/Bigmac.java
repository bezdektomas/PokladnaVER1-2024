package App.Burgery;

import App.Produkt;

public class Bigmac extends Produkt {
    public Bigmac(){
        nazev = "Big mac";
     }
    
     @Override
     public int cena() {
         return 89;
     }
}
