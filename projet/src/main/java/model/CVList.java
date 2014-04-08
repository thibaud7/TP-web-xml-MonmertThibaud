package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Thibaud on 08/04/2014.
 */
public class CVList {
    @XmlRootElement(name = "resumes")
    public class ResumeList {
        private List<CV> list;

        public ResumeList() {

        }

        public ResumeList(List<CV> l) {
            this.list = l;
        }

        public List<CV> getList() {
            return list;
        }

        @XmlElement
        public void setList(List<CV> l) {
            this.list = l;
        }

        public void add(CV r) {
            this.list.add(r);
        }

    }
}
