package kg.ksucta.service.river;

import kg.ksucta.domain.river.user.User;

import java.util.Optional;

public interface UserService {
    Optional<User> getByEmail(String email);
    Optional<User> getByLastname(String lastname);
    Optional<User> getByFirstname(String firstname);
    Optional<User> getByFirstnameAndLastname(String firstname, String lastname);
}
