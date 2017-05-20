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

    @RequestMapping(value = "/username/{username}",method = RequestMethod.GET)
    public Optional<User> getByUserName(@PathVariable("username") String userName){
        return userService.getByUserName(userName);
    }

    @RequestMapping(value = "/firstname/{firstname}",method = RequestMethod.GET)
    public Optional<User> getByFirstName(@PathVariable("firstname") String firstName){
        return userService.getByFirstName(firstName);
    }

    @RequestMapping(value = "/lastname/{lastname}",method = RequestMethod.GET)
    public Optional<User> getByLastName(@PathVariable("lastname") String lastName){
        return userService.getByLastName(lastName);
    }

    @RequestMapping(value = "/firstname-and-lastname",method = RequestMethod.GET)
    public Optional<User>  getByFirstNameAndLastName(@RequestParam("firstname") String firstName,@RequestParam("lastname") String lastName){
        return userService.getByFirstNameAndLastName(firstName, lastName);
    }

    @RequestMapping(value = "/group",method = RequestMethod.POST)
    public List<User> getByGroup(Group group ){

        return userService.getByGroup(group);
    }

    @RequestMapping(value = "/group-course/{group-course}",method = RequestMethod.GET)
    public List<User> getByGroup_Course(@PathVariable("group-course") String groupCourse){
        return userService.getByGroup_Course(groupCourse);
    }

}
