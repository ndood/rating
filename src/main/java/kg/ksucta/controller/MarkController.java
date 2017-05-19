package kg.ksucta.controller;

import kg.ksucta.domain.Group;
import kg.ksucta.domain.mark.Mark;
import kg.ksucta.domain.user.User;
import kg.ksucta.service.GroupService;
import kg.ksucta.service.MarkService;
import kg.ksucta.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mark")
public class MarkController {
    @Autowired
    MarkService markService;


    @RequestMapping(value = "/user/group/course/{course}", method = RequestMethod.GET)
    public List<Mark> getByCourse(@PathVariable("course") String course){
        List<Mark> marksByCourse = markService.getByUserGroupCourse(course);
        return marksByCourse;
    }

    @RequestMapping(value = "/user/group/groupname/{groupName}", method = RequestMethod.GET)
    public List<Mark> getByGroupName(@PathVariable("groupName") String groupName){
        List<Mark> marksByGroupName = markService.getByGroupName(groupName);
        return marksByGroupName;
    }

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
