package kg.ksucta.controller;

import kg.ksucta.domain.Group;
import kg.ksucta.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/group")
//@Controller("/group")
public class GroupController {
    @Autowired
    GroupService groupService;

    @RequestMapping(value ="/get/course",method = RequestMethod.GET)
    public List<Group> getByCourse(@RequestParam("course") String course){
        List<Group> groupsByCourse = groupService.getByCourse(course);
        return groupsByCourse;
    }

    @RequestMapping(value="/get/groupname",method = RequestMethod.GET)
    public Optional<Group> getByGroupname(@RequestParam("groupname")String groupname){
        Optional<Group> groupByGroupname = groupService.getByGroupname(groupname);
        return groupByGroupname;
    }

}
