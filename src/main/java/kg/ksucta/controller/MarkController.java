package kg.ksucta.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import kg.ksucta.domain.mark.Mark;
import kg.ksucta.service.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mark")
public class MarkController {
    @Autowired
    MarkService markService;


    @RequestMapping(method = RequestMethod.GET)
    public List<Mark> getByCourse(@RequestParam("course") String course) throws JsonProcessingException {

        List<Mark> marksByCourse = markService.getByCourse(course);
        return marksByCourse;
    }
    //produces={"application/json"}


    /*@RequestMapping(method = RequestMethod.GET)
    public List<Mark> getByGroupName(@PathVariable("groupName") String groupName){
        List<Mark> marksByGroupName = markService.getByGroupName(groupName);
        return marksByGroupName;
    }*/

    /*@RequestMapping(value = "/{group}", method = RequestMethod.GET)
    public Mark getByGroup(@PathVariable("group") Group group){
        List<Mark> marksByGroup = markService.getByUserGroup(group);
        return marksByGroup.get(1);
    }*/
    /*@RequestMapping(value = "/coursed/{course}", method = RequestMethod.GET)
    public Mark getByCoursed(@PathVariable("course") String course){
        List<Mark> marksByCourse = markService.getByUserGroupCourse(course);
        return marksByCourse.get(1);
    }*/

    //@RequestMapping(value = "/{user}")
}
