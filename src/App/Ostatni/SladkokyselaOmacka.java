package App.Ostatni;

import App.Produkt;

public class SladkokyselaOmacka extends Produkt {
    public SladkokyselaOmacka(){
        nazev = "Sladkokyselá omáčka";
     }
    
     @Override
     public int cena() {
         return 10;
     }
}
