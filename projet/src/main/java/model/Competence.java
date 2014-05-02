package model;

/**
 * Created by Thibaud on 08/04/2014.
 */
public class Competence {

    public Competence() {

    }

    public String getNomCompetence() {
        return nomCompetence;
    }

    public void setNomCompetence(String nomCompetence) {
        this.nomCompetence = nomCompetence;
    }

    private String nomCompetence;

    public int getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(int pourcentage) {
        this.pourcentage = pourcentage;
    }

    private int pourcentage;


}
