package kg.ksucta.repository;

import kg.ksucta.domain.Group;
import kg.ksucta.domain.mark.Mark;
import kg.ksucta.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MarkRepository extends JpaRepository<Mark, Long> {

    List<Mark> findByUserGroupGroupname(String groupName);
    List<Mark> findByUserGroupCourse(String course);

    List<Mark> findByUser_Username(String userName);
    List<Mark> findByUser_Id(Long id);
    List<Mark> findByUser_IdAndSemester(Long id, Long semester);
    List<Mark> findByUser_UsernameAndSemester(String username, Long semester);

    List<Mark> findByUser(User user);
    List<Mark> findByUserGroup(Group userGroup);
    List<Mark> findBySemesterAndUser(Long semester, User user);



}
