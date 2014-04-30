package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thibaud on 08/04/2014.
 */
@XmlRootElement(name = "cvlist")
public class CVList {

        @XmlElement(name = "cv")
        protected List<CV> list;

        public CVList() {
            list = new ArrayList<CV>();
        }

        public CVList(List<CV> l) {
            this.list = l;
        }

        public void add(CV r) {
            this.list.add(r);
        }

}

