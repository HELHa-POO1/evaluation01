package be.helha.poo1.evaluation01;

public class Adresse {
    private String rue;
    private String numero;
    private String cdp;
    private String ville;


    public Adresse(String rue, String numero, String cdp, String ville) {
        this.rue = rue;
        this.numero = numero;
        this.ville = ville;
        this.cdp = cdp;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCdp() {
        return cdp;
    }

    public void setCdp(String cdp) {
        this.cdp = cdp;
    }

    @Override
    public String toString() {
        return rue + ' ' + numero + " à " + cdp + ' ' + ville;
    }
}
