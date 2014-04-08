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
    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    CV getResumeInXML(@PathVariable String firstName) {

        CV resume = new CV();
        resume.setPrenom("Thibaud");
        resume.setNom("Monmert");

        return resume;

    }
}
