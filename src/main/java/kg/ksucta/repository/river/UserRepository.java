package kg.ksucta.repository.river;

import kg.ksucta.domain.river.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    Optional<User> findByLastname(String lastname);
    Optional<User> findByFirstname(String firstname);
    Optional<User> findByFirstnameAndLastname(String firstname, String lastname);
}
