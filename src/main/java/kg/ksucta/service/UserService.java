package kg.ksucta.service;

import kg.ksucta.domain.Group;
import kg.ksucta.domain.user.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<User> getByEmail(String email);
    Optional<User> getByUserName(String username);
    Optional<User> getByFirstName(String firstName);
    Optional<User> getByLastName(String lastName);
    Optional<User> getByFirstNameAndLastName(String firstName, String lastName);
    List<User> getByGroup(Group group);
    List<User> getByGroup_Course(String course);
}
