package kg.ksucta.service;


import kg.ksucta.domain.user.User;
import kg.ksucta.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DefaultUserService implements UserService {
    private final UserRepository userRepository;
    
    @Autowired
    public DefaultUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public UserRepository getUserRepository() {
        return userRepository;
    }

    @Override
    public Optional<User> getByEmail(String email) {
        return this.userRepository.findByEmail(email);
    }

    @Override
    public Optional<User> getByUserName(String username) {
        return this.userRepository.findByUsername(username);
    }

    @Override
    public Optional<User> getByFirstName(String firstName) {
        return this.userRepository.findByFirstName(firstName);
    }

    @Override
    public Optional<User> getByLastName(String lastName) {
        return this.userRepository.findByLastName(lastName);
    }
}
