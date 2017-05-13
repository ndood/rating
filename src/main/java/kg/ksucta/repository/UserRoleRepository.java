package kg.ksucta.repository;

import kg.ksucta.domain.user.Role;
import kg.ksucta.domain.user.User;
import kg.ksucta.domain.user.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    List<UserRole> findByRole(Role role);
    List<UserRole> findByUser(User user);
    List<UserRole> findByUserAndRole(User user, Role role);
    List<UserRole> findAll();
}
