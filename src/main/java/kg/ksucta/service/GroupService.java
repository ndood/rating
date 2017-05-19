package kg.ksucta.service;

import kg.ksucta.domain.Group;

import java.util.Optional;

/**
 * Created by tokjan on 12.05.2017.
 */
public interface GroupService {
    Optional<Group> getByCourse(String course);
    Optional<Group> getByGroupname(String groupname);
    //Optional<Group> getByUser(User user);
}
