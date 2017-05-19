package kg.ksucta.service;

import kg.ksucta.domain.Group;

import java.util.List;
import java.util.Optional;

/**
 * Created by tokjan on 12.05.2017.
 */
public interface GroupService {
    List<Group> getByCourse(String course);
    Optional<Group> getByGroupname(String groupname);
    //Optional<Group> getByUser(User user);
}
