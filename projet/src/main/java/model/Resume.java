package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Quentin on 01/04/14.
 */

@XmlRootElement(name = "resume")
public class Resume {
    private String firstName;
    private String lastName;

    public Resume() {

    }

    public Resume(String fname, String lname) {
        this.firstName = fname;
        this.lastName = lname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @XmlElement
    public void setFirstName(String name) {
        this.firstName = name;
    }

    @XmlElement
    public void setLastName(String name) {
        this.lastName = name;
    }
}
