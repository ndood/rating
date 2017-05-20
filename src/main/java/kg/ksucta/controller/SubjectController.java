package kg.ksucta.controller;

import kg.ksucta.domain.subject.Subject;
import kg.ksucta.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * Created by User on 20.05.2017.
 */
@RestController
@RequestMapping("/subject")
public class SubjectController {
    @Autowired
    SubjectService subjectService;

    @RequestMapping(value="/name/{subjectName}", method = RequestMethod.GET)
    public Subject getBySubjectName(@PathVariable("subjectName") String subjectName){
        Optional<Subject> subjectByName = subjectService.getBySubjectName(subjectName);
        return subjectByName.orElseGet(null);
    }
}
