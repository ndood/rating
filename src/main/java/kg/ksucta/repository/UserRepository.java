package kg.ksucta.repository;

import kg.ksucta.domain.Group;
import kg.ksucta.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CustomUserRepository, JpaRepository<User, Long> {
    Optional<User> findByFirstNameAndLastName(String firstName, String lastName);
    Optional<User> findByEmail(String email);
    Optional<User> findByUsername(String username);
    Optional<User> findByFirstName(String firstName);
    Optional<User> findByLastName(String lastName);
    List<User> findByGroup(Group group);
    List<User> findByGroup_Course(String groupCourse);
}
