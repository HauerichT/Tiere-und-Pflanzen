public class Pflanze extends Lebewesen {

    // Instanzvariablen
    private String beschreibung;

    // setzt die Beschreibung des Pflanzen-Objektes
    public void setBeschreibung(String pBeschreibung) {
        beschreibung = pBeschreibung;
    }

    // gibt die Beschreibung des Pflanzen-Objektes zurück
    public String getBeschreibung() {
        return beschreibung;
    }
}

