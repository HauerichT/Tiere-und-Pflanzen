public class Tier extends Lebewesen {

    // Instanzvariablen
    private String nahrungTiere = "-";
    private String nahrungPflanzen = "-";

    // Setter-Methoden
    public void addNahrung(Tier tier) {
        nahrungTiere = tier.getBezeichnung();
    }
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
