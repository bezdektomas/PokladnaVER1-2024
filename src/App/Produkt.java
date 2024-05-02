package App;

public abstract class Produkt {   
    protected String nazev;
   
    public String getNazev(){
        return nazev;
    }
   
    public abstract int cena();
}