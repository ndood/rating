package kg.ksucta.service;

import kg.ksucta.domain.Group;
import kg.ksucta.domain.mark.Mark;
import kg.ksucta.domain.user.User;

import java.util.List;
import java.util.Optional;

public interface MarkService  {

    List<Mark> getByCourse(String course);
    List<Mark> getByGroupName(String groupName);
    List<Mark> getByUserName(String userName);
    List<Mark> getByUserId(Long userId);
    List<Mark> getByUserIdAndSemester(Long userId, Long semester);
    List<Mark> getByUserNameAndSemester(String userName, Long semester);

    List<Mark> getByUserGroup(Group userGroup);
    List<Mark> getBySemesterAndUser(Long semester, User user);
    List<Mark> getByUser(User user);
}
