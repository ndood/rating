package kg.ksucta.controller;

import kg.ksucta.domain.Group;
import kg.ksucta.domain.user.User;
import kg.ksucta.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Created by salavat on 19.05.2017.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/get/username",method = RequestMethod.GET)
    public Optional<User> getByUserName(@RequestParam(value = "username") String userName){
        return userService.getByUserName(userName);
    }

    @RequestMapping(value = "/get/firstname",method = RequestMethod.GET)
    public Optional<User> getByFirstName(@RequestParam(value = "firstname") String firstName){
        return userService.getByFirstName(firstName);
    }

    @RequestMapping(value = "/get/lastname",method = RequestMethod.GET)
    public Optional<User> getByLastName(@RequestParam(value = "lastname") String lastName){
        return userService.getByLastName(lastName);
    }

    @RequestMapping(value = "/get/firstname-and-lastname",method = RequestMethod.GET)
    public Optional<User>  getByFirstNameAndLastName(@RequestParam("firstname") String firstName,@RequestParam("lastname") String lastName){
        return userService.getByFirstNameAndLastName(firstName, lastName);
    }

    @RequestMapping(value = "/get/group",method = RequestMethod.GET)
    public List<User> getByLastName(@ModelAttribute Group group ){
        return userService.getByGroup(group);
    }
    @RequestMapping(value = "/get/group-course",method = RequestMethod.GET)
    public List<User> getByGroup_Course(@RequestParam(value = "group-course") String groupCourse){
        return userService.getByGroup_Course(groupCourse);
    }

}
