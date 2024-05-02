## Objektová pokladna verze 1

Java projekt k pokladně týkající se napodobeniny pokladny McDonalds s možností tvorby menu a tisku objednávky do souboru.

## Struktura

- `App.java`: Spuštění programu, main class
- `Tiskarna.java`: Tisk objednávek do účtenky
- `ObjednavkaRozhrani.java`: Rozhraní pro třídu objednávek
- `Objednavka.java`: Třída pro správu objednávky
- `PolozkaRozhrni`: Rozhraní pro položku
- `Polozka.java`: Třída položky
- `ObjednavkySeznam.java`: Správa všech uskutečněných objednávek v relaci


## Tvoření položek

- Položky jsou dle kategorií roztříděny do několika složek: Burgery, Menu, Napoje, Ostatni
- Každá kategorie má svůj "decorator"
- Položka v každé dané kategorii má tedy stejné vlastnosti. Konstruktorem se vytváří její název a nastaví se její cena - rozšiřují se vlastnosti třídy Polozka.java
- V případě přídavků je využit "decorator", který v případě přídavků vezme vybraný produkt, zjistí si jeho vlastnosti a rozšíří ho o své přídavkové vlastnosti (zjištění aktuální ceny + ceny přidávku)

Příklad
- Burger = new OkurkaPridavek(Burger);
-> Vezmu si již aktuální existující instanci burgeru a vytvořím k ní nový přídavek, v tomto případě okurka

## GUI
- Následná tvorba objednávky je řešena pomocí Swing GUI

