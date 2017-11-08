package kg.ksucta.controller.river;

import kg.ksucta.domain.river.user.User;
import kg.ksucta.service.river.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/email/{email}", method = RequestMethod.GET)
    public User getByEmail(@PathVariable("email") String email){
        return userService.getByEmail(email).orElse(null);
    }

    @RequestMapping(value = "/firstname/{firstname}", method = RequestMethod.GET)
    public User getByFirstname(@PathVariable("firstname") String firstname){
        return userService.getByFirstname(firstname).orElse(null);
    }

    @RequestMapping(value = "/lastname/{lastname}", method = RequestMethod.GET)
    public User getByLastname(@PathVariable("lastname") String lastname){
        return userService.getByLastname(lastname).orElse(null);
    }

    @RequestMapping(value = "/firstnameAndLastname/{firstnameAndLastname}", method = RequestMethod.GET)
    public User getByFirstnameAndLastname(@PathVariable("firstnameAndLastname") String firstname, String lastname){
        return userService.getByFirstnameAndLastname(firstname, lastname).orElse(null);
    }
}
