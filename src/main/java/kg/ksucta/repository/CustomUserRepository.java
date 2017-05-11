package kg.ksucta.repository;

import kg.ksucta.domain.user.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by Aibek Isaev on 06.01.2017.
 */
public interface CustomUserRepository {

    public Optional<User> findByEmail(String email);
    public Optional<User> findByUsername(String username);
    public Optional<User> findByFirstName(String firstName);
    public Optional<User> findByLastName(String lastName);
}
