public class Tier extends Lebewesen {

    // Instanzvariablen
    private String nahrungTiere = "-";
    private String nahrungPflanzen = "-";

    // fügt dem Tier Objekt Tiere als Nahrung hinzu
    public void addNahrung(Tier tier) {
        nahrungTiere = tier.getBezeichnung();
    }

    // fügt dem Tier Objekt Pflanzen als Nahrung hinzu
    public void addNahrung(Pflanze pflanze) {
        nahrungPflanzen = pflanze.getBezeichnung();
    }

    /*
     * Prüft den Wert der Variablen nahrungTiere und nahrungPflanzen
     * und gibt die Nahrungsart des Tieres zurück
     */
    public String getNahrungsart() {
        if (nahrungTiere.equals("-") && !nahrungPflanzen.equals("-")) {
            return getBezeichnung() + " ist ein Pflanzenfresser.";
        }
        else if (!nahrungTiere.equals("-") && nahrungPflanzen.equals("-")) {
            return getBezeichnung() + " ist ein Fleischfresser.";
        }
        else if (!nahrungTiere.equals("-")) {
            return getBezeichnung() + " ist ein Allesfresser.";
        }
        else {
            return getBezeichnung() + " hat noch keine Nahrungsangaben.";
        }
    }

}
