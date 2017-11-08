package kg.ksucta.controller;

import kg.ksucta.domain.Group;
import kg.ksucta.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/group")
//@Controller("/group")
public class GroupController {
    @Autowired
    GroupService groupService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Group> getAll(){
        List<Group> groups = groupService.getAll();
        return groups;
    }

    @RequestMapping(value ="/course/{course}",method = RequestMethod.GET)
    public List<Group> getByCourse(@PathVariable("course") String course){
        List<Group> groupsByCourse = groupService.getByCourse(course);
        return groupsByCourse;
    }

    @RequestMapping(value="/groupname/{groupname}",method = RequestMethod.GET)
    public Optional<Group> getByGroupname(@PathVariable("groupname")String groupname){
        Optional<Group> groupByGroupname = groupService.getByGroupname(groupname);
        return groupByGroupname;
    }

}
