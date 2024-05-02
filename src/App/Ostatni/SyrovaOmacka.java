package App.Ostatni;

import App.Produkt;

public class SyrovaOmacka extends Produkt {
    public SyrovaOmacka(){
        nazev = "Sýrová omáčka";
     }
    
     @Override
     public int cena() {
         return 15;
     }
}
