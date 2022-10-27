public class Tier {
    private String bezeichnung;
    private String nahrungTiere = "-";
    private String nahrungPflanzen = "-";
    private String nahrungsart = "-";

    public void setBezeichnung(String pBezeichnung) {
        bezeichnung = pBezeichnung;
    }

    public void setNahrungTiere(String pTier) {
        nahrungTiere = pTier;
    }

    public void setNahrungPflanzen(String pPflanze) {
        nahrungPflanzen = pPflanze;
    }

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
