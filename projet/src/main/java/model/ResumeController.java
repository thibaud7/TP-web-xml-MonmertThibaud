package model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Quentin on 01/04/14.
 */

@Controller
@RequestMapping("/resume")
public class ResumeController {

    @RequestMapping(value="{firstName}", method = RequestMethod.GET)
    public @ResponseBody
    Resume getResumeInXML(@PathVariable String firstName) {

        Resume resume = new Resume(firstName, "");

        return resume;

    }

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    ResumeList getResumesInXML() {
        List l = new ArrayList();
        l.add(new Resume("Quentin", "Auvray"));
        l.add(new Resume("Jean-Loup", "Adde"));
        ResumeList list = new ResumeList(l);
        /*Resume resume = new Resume("Quentin", "Auvray");
        list.add(resume);
        resume = new Resume("Auvray", "Quentin");
        list.add(resume);*/
        return list;

    }


}
