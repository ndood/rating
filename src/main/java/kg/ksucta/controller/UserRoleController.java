package kg.ksucta.controller;

import kg.ksucta.domain.user.Role;
import kg.ksucta.domain.user.User;
import kg.ksucta.domain.user.UserRole;
import kg.ksucta.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/userRole")
public class UserRoleController {
    @Autowired
    UserRoleService userRoleService;

    @RequestMapping(value = "/user/userRole/role/{role}", method = RequestMethod.GET)
    public List<UserRole> getByRole(@PathVariable("role") Role role) {
        List<UserRole> userRolesByRole = userRoleService.getByRole(role);
        return userRolesByRole;
    }

    @RequestMapping(value = "/user/userRole/user_id/{user_id}", method = RequestMethod.GET)
    public List<UserRole> getByUser(@PathVariable("user_id")User user){
        List<UserRole> userRolesByUser = userRoleService.getByUser(user);
        return userRolesByUser;
    }

    @RequestMapping(value = "/user/userRole/userAndRole/{userAndRole", method = RequestMethod.GET)
    public List<UserRole> getByUserAndRole(@PathVariable("user") User user, @PathVariable("role") Role role){
        List<UserRole> userRolesByUserAndRole = userRoleService.getByUserAndRole(user, role);
        return userRolesByUserAndRole;
    }
    /*@RequestMapping(method = RequestMethod.GET)
    public List<UserRole> getByRole(@RequestParam("role") Role role) throws JsonProcessingException{
        List<UserRole> userRolesByRole = userRoleService.getByRole(role);
        return userRolesByRole;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<UserRole> getByUser(@RequestParam("user_id") User user) throws JsonProcessingException{
        List<UserRole> userRolesByUser = userRoleService.getByUser(user);
        return userRolesByUser;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<UserRole> getByUserAndRole(@RequestParam("user") User user, @RequestParam("role") Role role)
            throws JsonProcessingException{
        List<UserRole> userRolesByUserAndRole = userRoleService.getByUserAndRole(user, role);
        return userRolesByUserAndRole;
    }*/
}
