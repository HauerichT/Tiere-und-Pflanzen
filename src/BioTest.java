public class BioTest {
    public static void main(String[] args) {
        Tier pferd = new Tier();
        pferd.setBezeichnung("Pferd");
        pferd.setNahrungPflanzen("Gras");
        pferd.setNahrungTiere("Esel");
        System.out.println(pferd.getNahrungsart());

        Pflanze gras = new Pflanze();
        gras.setBezeichnung("Gras");
        gras.setBeschreibung("grün");
    }
}