package kg.ksucta.service;

import kg.ksucta.domain.Group;
import kg.ksucta.domain.mark.Mark;
import kg.ksucta.domain.user.User;
import kg.ksucta.repository.MarkRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

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
    public List<Mark> getByCourse(String course) {
        Assert.hasText(course, "Course must not be empty!!!");
        return markRepository.findByUserGroupCourse(course);
    }

    @Override
    public List<Mark> getByGroupName(String groupName) {
        Assert.hasText(groupName, "Group name must not be empty!!!");
        return markRepository.findByUserGroupGroupname(groupName);
    }

    @Override
    public List<Mark> getByUserName(String userName) {
        Assert.hasText(userName, "UserName must not be empty!!!");
        return markRepository.findByUser_Username(userName);
    }

    @Override
    public List<Mark> getByUserId(Long userId) {
        Assert.notNull(userId, "UserID must be not null!!!");
        return markRepository.findByUser_Id(userId);
    }

    @Override
    public List<Mark> getByUserIdAndSemester(Long userId, Long semester) {
        Assert.notNull(semester, "Semester must be not null!!!");
        Assert.notNull(userId, "UserID must be not null!!!");
        return markRepository.findByUser_IdAndSemester(userId, semester);
    }

    @Override
    public List<Mark> getByUserNameAndSemester(String userName, Long semester) {
        Assert.hasText(userName, "UserName must not be empty!!!");
        Assert.notNull(semester, "Semester must be not null!!!");
        return markRepository.findByUser_UsernameAndSemester(userName, semester);
    }
}
