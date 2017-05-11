package kg.ksucta.service;

import kg.ksucta.domain.user.User;

import java.util.Optional;

public interface UserService {
    public Optional<User> getByEmail(String email);
    public Optional<User> getByUserName(String username);
    public Optional<User> getByFirstName(String firstName);
    public Optional<User> getByLastName(String lastName);
}
