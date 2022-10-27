public class BioTest {
    public static void main(String[] args) {

        // Testszenarien

        // Initialisierung des Pflanzen-Objektes gras
        Pflanze gras = new Pflanze();
        gras.setBezeichnung("Gras");
        gras.setBeschreibung("grün");
        System.out.println(gras.getBezeichnung() + " ist " + gras.getBeschreibung());

        // Initialisierung des Pflanzen-Objektes beere
        Pflanze beere = new Pflanze();
        beere.setBezeichnung("Beere");
        beere.setBeschreibung("rot");
        System.out.println(beere.getBezeichnung() + "n sind " + beere.getBeschreibung());

        // Initialisierung des Pflanzen-Objektes alge
        Pflanze alge = new Pflanze();
        alge.setBezeichnung("Alge");
        alge.setBeschreibung("silber");
        System.out.println(alge.getBezeichnung() + "n sind " + alge.getBeschreibung());

        // Initialisierung des Tier-Objektes zebra
        Tier zebra = new Tier();
        zebra.setBezeichnung("Zebra");
        zebra.setNahrungPflanzen("Gras");
        System.out.println(zebra.getBezeichnung() + "s fressen " + zebra.getNahrungPflanzen());

        // Initialisierung des Tier-Objektes loewe
        Tier loewe = new Tier();
        loewe.setBezeichnung("Löwe");
        loewe.setNahrungTiere("Zebras");
        System.out.println(loewe.getBezeichnung() + "n fressen " + loewe.getNahrungTiere());

        // Initialisierung des Tier-Objektes baer
        Tier baer = new Tier();
        baer.setBezeichnung("Bär");
        baer.setNahrungPflanzen("Beeren");
        baer.setNahrungTiere("Fische");
        System.out.println(baer.getBezeichnung() + "en fressen " + baer.getNahrungPflanzen());
        System.out.println(baer.getBezeichnung() + "en fressen " + baer.getNahrungTiere());

        // Zeile zur besseren Übersicht
        System.out.println("---------------");

        // Ausgabe der Nahrungsart
        System.out.println(zebra.getNahrungsart());
        System.out.println(loewe.getNahrungsart());
        System.out.println(baer.getNahrungsart());

    }
}