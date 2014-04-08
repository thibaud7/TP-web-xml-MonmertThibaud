package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Quentin on 01/04/14.
 */
@XmlRootElement(name = "resumes")
public class ResumeList {
    private List<Resume> list;

    public ResumeList() {

    }

    public ResumeList(List<Resume> l) {
        this.list = l;
    }

    public List<Resume> getList() {
        return list;
    }

    @XmlElement
    public void setList(List<Resume> l) {
        this.list = l;
    }

    public void add(Resume r) {
        this.list.add(r);
    }

}
