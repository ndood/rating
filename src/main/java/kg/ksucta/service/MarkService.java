package kg.ksucta.service;

import kg.ksucta.domain.Group;
import kg.ksucta.domain.mark.Mark;
import kg.ksucta.domain.user.User;

import java.util.List;

public interface MarkService  {
    List<Mark> getByUserGroup(Group userGroup);
    List<Mark> getBySemesterAndUser(Long semester, User user);
    List<Mark> getByUser(User user);
    List<Mark> getByUserGroupCourse(String course);
}
