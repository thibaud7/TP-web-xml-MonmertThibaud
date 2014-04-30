package model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Thibaud on 08/04/2014.
 */
@Controller
@RequestMapping("/cv")
public class CVController {

    private static CVList cvlist;

    static {
        cvlist = new CVList();
        CV cv1 = new CV();
        cv1.setPrenom("Wilson");
        cv1.setNom("Churchil");
        cvlist.add(cv1);
        CV cv2 = new CV();
        cv2.setPrenom("Cristiano");
        cv2.setNom("Ronaldo");
        cvlist.add(cv2);
    }

    public CVController() {

    }

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody CVList getResumeInXML() {
        return cvlist;
    }
}
