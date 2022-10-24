public class Tiere {
    private String bezeichnung;
    private String nahrungTiere = "-";
    private String nahrungPflanzen = "-";

    public static void addNahrungTiere(String tier) {
        nahrungTier = tier;
    }

    public static void addNahrungPflanzen(String pflanze) {
        nahrungPflanzen = pflanze;
    }

    public static void checkNahrungsart(String pNahrungTiere, String pNahrungPflanzen) {
        if (pNahrungTiere.equals("-") && !pNahrungPflanzen.equals("-")) {
            System.out.println(bezeichnung + "ist ein Pflanzenfresser");
        }
        else if (!pNahrungTiere.equals("-") && pNahrungPflanzen.equals("-")) {
            System.out.println(bezeichnung + "ist ein Fleischfresser");
        }
        else if (!pNahrungTiere.equals("-") && !pNahrungPflanzen.equals("-")) {
            System.out.println(bezeichnung + "ist ein Allesfresser");
        }
    }

    public static void setBezeichnung(String pBezeichnung) {
        bezeichnung = pBezeichnung;
    }
}
