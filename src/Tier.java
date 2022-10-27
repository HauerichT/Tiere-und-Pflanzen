public class Tier {

    // Instanzvariablen
    private String bezeichnung;
    private String nahrungTiere = "-";
    private String nahrungPflanzen = "-";
    private String nahrungsart = "-";


    // Setter-Methoden
    public void setBezeichnung(String pBezeichnung) {
        bezeichnung = pBezeichnung;
    }
    public void setNahrungTiere(String pTier) {
        nahrungTiere = pTier;
    }
    public void setNahrungPflanzen(String pPflanze) {
        nahrungPflanzen = pPflanze;
    }

    // Getter-Methoden
    public String getBezeichnung() {
        return bezeichnung;
    }
    public String getNahrungTiere() {
        return nahrungTiere;
    }
    public String getNahrungPflanzen() {
        return nahrungPflanzen;
    }

    /*
     * Prüft den Wert der Variablen nahrungTiere und nahrungPflanzen
     * und gibt die Nahrungsart des Tieres zurück
     */
    public String getNahrungsart() {
        if (nahrungTiere.equals("-") && !nahrungPflanzen.equals("-")) {
            nahrungsart = "Pflanzenfresser";
        }
        else if (!nahrungTiere.equals("-") && nahrungPflanzen.equals("-")) {
            nahrungsart = "Fleischfresser";
        }
        else if (!nahrungTiere.equals("-") && !nahrungPflanzen.equals("-")) {
            nahrungsart = "Allesfresser";
        }
        else {
            nahrungsart = "(Nahrung ist noch nicht definiert).";
        }

        return bezeichnung + " ist ein " + nahrungsart + ".";
    }

}
