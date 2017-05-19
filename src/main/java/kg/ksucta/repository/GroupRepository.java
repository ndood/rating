package kg.ksucta.repository;

import kg.ksucta.domain.Group;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by tokjan on 12.05.2017.
 */
public interface GroupRepository extends JpaRepository<Group, Long> {
    Optional<Group> findByCourse(String course);
    Optional<Group> findByGroupname(String groupname);
    //Optional<Group> findByUser(User user);
}
