package sio.tp5.Model;

public class Fleur
{
    private String nomFleur;
    private double prixFleur;
    private int quantiteFleur;

    public String getNomFleur() {
        return nomFleur;
    }

    public double getPrixFleur() {
        return prixFleur;
    }

    public int getQuantiteFleur() {
        return quantiteFleur;
    }

    public Fleur(String nomFleur, double prixFleur, int quantiteFleur) {
        this.nomFleur = nomFleur;
        this.prixFleur = prixFleur;
        this.quantiteFleur = quantiteFleur;
    }

    public void setQuantiteFleur(int quantiteFleur) {
        this.quantiteFleur = quantiteFleur;
    }
}
