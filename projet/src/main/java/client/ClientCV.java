package client;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.swing.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by Thibaud on 02/05/2014.
 */
public class ClientCV {

    //Frame principale
    private JFrame frame;

    //Menu de l'application
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem ajouterCV;
    private JMenuItem voirCVs;

    //Affichage principal
    private JTextArea principal;




    private static final String URL_CONNEXION = "http://tp-web-xml-monmertthibaud.thibaud7.cloudbees.net/rest/cv";

    public ClientCV(){
        createView();
        placeComponents();
        createController();
    }

    public void display() {
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public void createView() {
        frame = new JFrame("Application : Projet Languages Web : Monmert");
        menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        menu = new JMenu("Actions");
        menuBar.add(menu);
        ajouterCV = new JMenuItem("Ajouter un CV");
        voirCVs = new JMenuItem("Voir tous les cv");
        menu.add(ajouterCV);
        menu.add(voirCVs);
    }

    public void placeComponents(){

    }

    public void createController() {

    }



    private String lectureCV(Document d) {
        String cvsResultat = "";
        NodeList cvs = d.getElementsByTagName("cv");
        int nombreCV = cvs.getLength();
        //Lecture de l'ensemble des cv
        for (int n = 0; n < nombreCV; n++) {
            Node cv = cvs.item(n);
            NodeList fils = cv.getChildNodes();
            cvsResultat += "Numero de cv : " + fils.item(0).getTextContent();
        }
        return cvsResultat;
    }

    private void getCVs() throws ParserConfigurationException, IOException, SAXException {


        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setValidating(false);
        factory.setNamespaceAware(true);

        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(URL_CONNEXION);

        String resultatLecture = lectureCV(document);

        principal.setText(resultatLecture);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ClientCV().display();
            }
        });
    }

}
