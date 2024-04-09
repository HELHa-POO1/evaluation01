package be.helha.poo1.evaluation01;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

    Voiture voiture1 = new Voiture("Audi", "Noire", "A4", 10, 60, 5, 23000, new Adresse("Rue du tieux","23a","6001", "Marcinelle"));
    System.out.println(voiture1);
    voiture1.rouler(100);
    System.out.println(voiture1);
    voiture1.ajouterEssence(45);
    System.out.println(voiture1);
    voiture1.ajouterEssence(45);
    System.out.println(voiture1);
    }
}