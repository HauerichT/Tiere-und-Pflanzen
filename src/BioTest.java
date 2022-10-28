public class BioTest {
    public static void main(String[] args) {

        /*
         * Erzeugt neue Objekte der Klassen Tier oder Pflanze
         * und weist diesen Eigenschaften zu (Bezeichnung, Beschreibung,Nahrung)
         */

        // Instanziierung des Pflanzen-Objektes gras
        Pflanze gras = new Pflanze();
        gras.setBezeichnung("Gras");
        gras.setBeschreibung("grün");

        // Instanziierung des Pflanzen-Objektes beere
        Pflanze beere = new Pflanze();
        beere.setBezeichnung("Beere");
        beere.setBeschreibung("rot");

        // Instanziierung des Pflanzen-Objektes alge
        Pflanze alge = new Pflanze();
        alge.setBezeichnung("Alge");
        alge.setBeschreibung("silber");

        // Instanziierung des Tier-Objektes fisch
        Tier fisch = new Tier();
        fisch.setBezeichnung("Fisch");
        fisch.addNahrung(alge);

        // Instanziierung des Tier-Objektes zebra
        Tier zebra = new Tier();
        zebra.setBezeichnung("Zebra");
        zebra.addNahrung(gras);

        // Instanziierung des Tier-Objektes loewe
        Tier loewe = new Tier();
        loewe.setBezeichnung("Löwe");
        loewe.addNahrung(zebra);

        // Instanziierung des Tier-Objektes baer
        Tier baer = new Tier();
        baer.setBezeichnung("Bär");
        baer.addNahrung(beere);
        baer.addNahrung(fisch);

        /*
         * Ruft die Methode getNahrungsart auf und gibt
         * basierend auf der hinzugefügten Nahrung die Nahrungsart zurück
         */
        System.out.println(zebra.getNahrungsart());
        System.out.println(loewe.getNahrungsart());
        System.out.println(baer.getNahrungsart());

    }
}