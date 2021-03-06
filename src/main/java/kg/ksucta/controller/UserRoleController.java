package kg.ksucta.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import kg.ksucta.domain.user.Role;
import kg.ksucta.domain.user.User;
import kg.ksucta.domain.user.UserRole;
import kg.ksucta.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/userRole")
public class UserRoleController {
    @Autowired
    UserRoleService userRoleService;

//    @RequestMapping(value = "/role/{role}", method = RequestMethod.GET)
//    public List<UserRole> getByRole(@PathVariable("role") Role role) {
//        List<UserRole> userRolesByRole = userRoleService.getByRole(role);
//        return userRolesByRole;
//    }

    @RequestMapping(value = "/user/{user}", method = RequestMethod.GET)
    public List<UserRole> getByUser(@PathVariable("user")User user){
        List<UserRole> userRolesByUser = userRoleService.getByUser(user);
        return userRolesByUser;
    }

    @RequestMapping(value = "/userAndRole/{userAndRole}", method = RequestMethod.GET)
    public List<UserRole> getByUserAndRole(@PathVariable("user") User user, @PathVariable("role") Role role){
        List<UserRole> userRolesByUserAndRole = userRoleService.getByUserAndRole(user, role);
        return userRolesByUserAndRole;
    }

    @RequestMapping(value = "/userRole", method = RequestMethod.GET)
    public UserRole getByRole(@RequestBody Role role) throws JsonProcessingException {
        Optional<UserRole> userRolesByRole = userRoleService.getByRole(role);
        return userRolesByRole.orElseGet(null);
    }
    @RequestMapping(value = "username/{userName}", method = RequestMethod.GET)
    public List<UserRole> getByUserName(@PathVariable("userName") String userName){
        List<UserRole> userRoles = userRoleService.getByUserName(userName);
        return userRoles;
    }
//    @RequestMapping(method = RequestMethod.GET)
//    public List<UserRole> getByUser(@RequestParam("user") User user) throws JsonProcessingException {
//        List<UserRole> userRolesByUser = userRoleService.getByUser(user);
//        return userRolesByUser;
//    }

//    @RequestMapping(method = RequestMethod.GET)
//    public List<UserRole> getByUserAndRole(@RequestParam("user") User user, @RequestParam("role") Role role)
//            throws JsonProcessingException{
//        List<UserRole> userRolesByUserAndRole = userRoleService.getByUserAndRole(user, role);
//        return userRolesByUserAndRole;
//    }
}
