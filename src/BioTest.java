public class BioTest {
    public static void main(String[] args) {

        // Testszenarien

        // Initialisierung des Pflanzen-Objektes gras
        Pflanze gras = new Pflanze();
        gras.setBezeichnung("Gras");
        gras.setBeschreibung("grün");

        // Initialisierung des Pflanzen-Objektes beere
        Pflanze beere = new Pflanze();
        beere.setBezeichnung("Beere");
        beere.setBeschreibung("rot");

        // Initialisierung des Pflanzen-Objektes alge
        Pflanze alge = new Pflanze();
        alge.setBezeichnung("Alge");
        alge.setBeschreibung("silber");

        // Initialisierung des Tier-Objektes zebra
        Tier zebra = new Tier();
        zebra.setBezeichnung("Zebra");
        zebra.setNahrungPflanzen("Gras");

        // Initialisierung des Tier-Objektes loewe
        Tier loewe = new Tier();
        loewe.setBezeichnung("Löwe");
        loewe.setNahrungTiere("Zebras");

        // Initialisierung des Tier-Objektes baer
        Tier baer = new Tier();
        baer.setBezeichnung("Bär");
        baer.setNahrungPflanzen("Beeren");
        baer.setNahrungTiere("Fische");


        // Testausgaben

        // Ausgabe der Nahrungsart
        System.out.println(zebra.getNahrungsart());
        System.out.println(loewe.getNahrungsart());
        System.out.println(baer.getNahrungsart());

    }
}