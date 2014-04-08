package model;

/**
 * Created by Thibaud on 08/04/2014.
 */
public class Formation {
    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getAnneeDebut() {
        return anneeDebut;
    }

    public void setAnneeDebut(Date anneeDebut) {
        this.anneeDebut = anneeDebut;
    }

    public Date getAnneeFin() {
        return anneeFin;
    }

    public void setAnneeFin(Date anneeFin) {
        this.anneeFin = anneeFin;
    }

    private String lieu;
    private String nom;
    private Date anneeDebut;
    private Date anneeFin;
}
