package kg.ksucta.service;

import io.jsonwebtoken.lang.Assert;
import kg.ksucta.domain.Group;
import kg.ksucta.repository.GroupRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by tokjan on 12.05.2017.
 */
@Service
public class GroupServiceImpl implements GroupService {
    private final GroupRepository groupRepository;

    public GroupServiceImpl(GroupRepository groupRepository){
        this.groupRepository = groupRepository;
    }

    @Override
    public List<Group> getByCourse(String course) {
        Assert.hasText(course, "Course must not be empty!");
        return groupRepository.findByCourse(course);
    }

    @Override
    public Optional<Group> getByGroupname(String groupname) {
        Assert.hasText(groupname, "Group name must not be empty!");
        return groupRepository.findByGroupname(groupname);
    }

    /*@Override
    public Optional<Group> getByUser(User user) {
        Assert.notNull(user, "User must not be null!");
        return groupRepository.findByUser(user);
    }*/
}
