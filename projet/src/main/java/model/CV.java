package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thibaud on 08/04/2014.
 */
@XmlRootElement(name = "cv")
public class CV {
    static int numCreation;
    private int id;
    private int age;
    private String nom;
    private String prenom;
    private String metier;
    @XmlElementWrapper(name = "formations")
    @XmlElement(name = "formation")
    private List<Formation> formations;
    @XmlElementWrapper(name = "competences")
    @XmlElement(name = "competence")
    private List<Competence> competences;
    @XmlElementWrapper(name = "langues")
    @XmlElement(name = "langue")
    private List<Langue> langues;

    public CV() {
        numCreation++;
        id = numCreation;
        nom = "";
        prenom = "";
        metier = "";
        formations = new ArrayList<Formation>();
        Formation f = new Formation();
        formations.add(f);
        competences = new ArrayList<Competence>();
        langues = new ArrayList<Langue>();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMetier() {
        return metier;
    }

    public void setMetier(String metier) {
        this.metier = metier;
    }

    public List<Formation> getFormations() {
        return formations;
    }

    public void setFormations(List<Formation> formations) {
        this.formations = formations;
    }

    public List<Competence> getCompetences() {
        return competences;
    }

    public void setCompetences(List<Competence> competences) {
        this.competences = competences;
    }

    public List<Langue> getLangues() {
        return langues;
    }

    public void setLangues(List<Langue> langues) {
        this.langues = langues;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
