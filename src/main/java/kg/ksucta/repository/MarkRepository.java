package kg.ksucta.repository;

import kg.ksucta.domain.Group;
import kg.ksucta.domain.mark.Mark;
import kg.ksucta.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MarkRepository extends JpaRepository<Mark, Long> {

    Optional<Mark> findByUserGroup(Group userGroup);
    Optional<Mark> findBySemesterAndUser(Long semester, User user);
    Optional<Mark> findByUser(User user);
    Optional<Mark> findByUserGroupCourse(String course);








}
