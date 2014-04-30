package model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
        cv2.setAge(28);
        cv2.setMetier("Footballeur");
        cvlist.add(cv2);
    }

    public CVController() {

    }

    @RequestMapping(method = RequestMethod.PUT)
    public @ResponseBody CV putCVInXML(@RequestBody CV cv) {
        cvlist.add(cv);
        return cv;
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public @ResponseBody CV getCVInXML(@PathVariable int id) {
        return cvlist.getCV(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody CVList getResumeInXML() {
        return cvlist;
    }
}
