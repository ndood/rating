package kg.ksucta.service;

import kg.ksucta.domain.Group;
import kg.ksucta.domain.mark.Mark;
import kg.ksucta.domain.user.User;

import java.util.Optional;

public interface MarkService  {
    Optional<Mark> getByUserGroup(Group userGroup);
    Optional<Mark> getBySemesterAndUser(Long semester, User user);
    Optional<Mark> getByUser(User user);
    Optional<Mark> getByUserGroupCourse(String course);
}
