package be.helha.poo1.evaluation01;

public class Voiture {
    private String marque;
    private String couleur;
    private String modele;
    private double consommation;
    private double reservoirMax;
    private double reservoirContenu;
    private double compteur;
    private Adresse adresse;

    public Voiture(String marque, String couleur, String modele, double consommation,
                   double reservoirMax, double reservoirContenu, double compteur,
                   Adresse adresse) {
        this.marque = marque;
        this.couleur = couleur;
        this.modele = modele;
        this.consommation = consommation;
        this.reservoirMax = reservoirMax;
        this.reservoirContenu = reservoirContenu;
        this.compteur = compteur;
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "marque='" + marque + '\'' +
                ", couleur='" + couleur + '\'' +
                ", modele='" + modele + '\'' +
                ", consommation=" + consommation +
                ", capacite reservoir max=" + reservoirMax +
                ", contenu reservoir=" + reservoirContenu +
                ", compteur=" + compteur +
                ", adresse=" + adresse +
                '}';
    }

    public void rouler(double distance) {
        double distanceMax = ( reservoirContenu / consommation ) * 100;
        if (distanceMax < distance) {
            System.out.println( "Erreur, la voiture ne peut rouler que : " + distanceMax + "km");
            distance = distanceMax;
        }
        compteur += distance;
        reservoirContenu -= ( distance * consommation ) /100;
    }
    public void ajouterEssence(double quantite) {
        double ajoutMax = ( reservoirMax - reservoirContenu );
        if (ajoutMax < quantite) {
            System.out.println( "Erreur, on ne peut ajouter que : " + ajoutMax + "L");
            quantite = ajoutMax;
        }
        reservoirContenu+=quantite;
    }
    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public double getConsommation() {
        return consommation;
    }

    public void setConsommation(double consommation) {
        this.consommation = consommation;
    }

    public double getReservoirMax() {
        return reservoirMax;
    }

    public void setReservoirMax(double reservoirMax) {
        this.reservoirMax = reservoirMax;
    }

    public double getReservoirContenu() {
        return reservoirContenu;
    }

    public double getCompteur() {
        return compteur;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
