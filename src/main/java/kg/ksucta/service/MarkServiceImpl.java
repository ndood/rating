package kg.ksucta.service;

import kg.ksucta.domain.Group;
import kg.ksucta.domain.mark.Mark;
import kg.ksucta.domain.user.User;
import kg.ksucta.repository.MarkRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@Service
public class MarkServiceImpl implements MarkService{
    private final MarkRepository markRepository;

    public MarkServiceImpl(MarkRepository markRepository) {
        this.markRepository = markRepository;
    }

    @Override
    public List<Mark> getByUserGroup(Group userGroup) {
        Assert.notNull(userGroup, "Group must not be null!!!");
        return markRepository.findByUserGroup(userGroup);
    }

    @Override
    public List<Mark> getBySemesterAndUser(Long semester, User user) {
        Assert.notNull(semester, "Semester must be not null!!!");
        Assert.notNull(user, "User must not be null!!!");
        return markRepository.findBySemesterAndUser(semester, user);
    }

    @Override
    public List<Mark> getByUser(User user) {
        Assert.notNull(user, "User must not be null!!!");
        return markRepository.findByUser(user);
    }

    @Override
    public List<Mark> getByUserGroupCourse(String course) {
        Assert.hasText(course, "Course must not be empty!!!");
        return markRepository.findByUserGroupCourse(course);
    }

    @Override
    public List<Mark> getByGroupName(String groupName) {
        Assert.hasText(groupName, "Group name must not be empty!!!");
        return markRepository.findByUserGroupGroupname(groupName);
    }
}
