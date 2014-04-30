package model;

/**
 * Created by Thibaud on 08/04/2014.
 */
public class Langue {

    private String intitule;
    private int pourcentage;

    Langue() {
        intitule = new String();
        pourcentage = 50;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public int getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(int pourcentage) {
        this.pourcentage = pourcentage;
    }


}
