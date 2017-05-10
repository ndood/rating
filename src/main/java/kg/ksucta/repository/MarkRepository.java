package kg.ksucta.repository;

import kg.ksucta.domain.Group;
import kg.ksucta.domain.mark.Mark;
import kg.ksucta.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MarkRepository extends JpaRepository<Mark, Long> {

    List<Mark> findByUserGroup(Group userGroup);
    List<Mark> findBySemesterAndUser(Long semester, User user);
    List<Mark> findByUser(User user);
    List<Mark> findAll();






}
