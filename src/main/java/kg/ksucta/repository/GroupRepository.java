package kg.ksucta.repository;

import kg.ksucta.domain.Group;
import kg.ksucta.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Created by tokjan on 12.05.2017.
 */
public interface GroupRepository extends JpaRepository<Group, Long> {
    List<Group> findByCourse(String course);
    Optional<Group> findByGroupname(String groupname);
    //Optional<Group> findByUser(User user);
}
