package genopfrisk;

public class Bog {
    private int iSBNNummer;
    private String titel;
    private int udgivelsesaar;

    public Bog(int iSBNNummer, String titel, int udgivelsesaar) {
        this.iSBNNummer = iSBNNummer;
        this.titel = titel;
        this.udgivelsesaar = udgivelsesaar;
    }

    public int getISBNNummer() {
        return iSBNNummer;
    }

    public void setISBNNummer(int iSBNNummer) {
        this.iSBNNummer = iSBNNummer;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getUdgivelsesaar() {
        return udgivelsesaar;
    }

    public void setUdgivelsesaar(int udgivelsesaar) {
        this.udgivelsesaar = udgivelsesaar;
    }


    @Override
    public String toString() {
        return "Bog{" +
                "iSBNNummer='" + iSBNNummer + '\'' +
                ", titel='" + titel + '\'' +
                ", udgivelsesaar=" + udgivelsesaar +
                '}';
    }
}
