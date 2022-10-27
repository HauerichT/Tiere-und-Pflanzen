public class BioTest {
    public static void main(String[] args) {

        // Testszenarien

        // Initialisierung des Pflanzen-Objektes gras
        Pflanze gras = new Pflanze();
        gras.setBezeichnung("Gras");
        gras.setBeschreibung("grün");
        String grasBezeichnung = gras.getBezeichnung();
        String grasBeschreibung = gras.getBeschreibung();

        // Initialisierung des Pflanzen-Objektes beere
        Pflanze beere = new Pflanze();
        beere.setBezeichnung("Beere");
        beere.setBeschreibung("rot");
        String beereBezeichnung = beere.getBezeichnung();
        String beereBeschreibung = beere.getBeschreibung();

        // Initialisierung des Pflanzen-Objektes alge
        Pflanze alge = new Pflanze();
        alge.setBezeichnung("Alge");
        alge.setBeschreibung("silber");
        String algeBezeichnung = alge.getBezeichnung();
        String algeBeschreibung = alge.getBeschreibung();

        // Initialisierung des Tier-Objektes zebra
        Tier zebra = new Tier();
        zebra.setBezeichnung("Zebra");
        zebra.setNahrungPflanzen("Gras");
        String zebraBezeichnung = zebra.getBezeichnung();
        String zebraNahrungPflanzen = zebra.getNahrungPflanzen();

        // Initialisierung des Tier-Objektes loewe
        Tier loewe = new Tier();
        loewe.setBezeichnung("Löwe");
        loewe.setNahrungTiere("Zebras");
        String loeweBezeichnung = loewe.getBezeichnung();
        String loeweNahrungTiere = loewe.getNahrungTiere();

        // Initialisierung des Tier-Objektes baer
        Tier baer = new Tier();
        baer.setBezeichnung("Bär");
        baer.setNahrungPflanzen("Beeren");
        baer.setNahrungTiere("Fische");
        String baerBezeichnung = baer.getBezeichnung();
        String baerNahrungPflanzen = baer.getNahrungPflanzen();
        String baerNahrungTiere = baer.getNahrungTiere();

        // Testausgaben

        // Ausgabe der Nahrungsart
        System.out.println(zebra.getNahrungsart());
        System.out.println(loewe.getNahrungsart());
        System.out.println(baer.getNahrungsart());

    }
}