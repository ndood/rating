package kg.ksucta.repository;

import kg.ksucta.domain.user.User;
import kg.ksucta.domain.user.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    List<UserRole> findByRole(String role);
    List<UserRole> findByUserId(Long userId);
    List<UserRole> findByUserIdAndRole(Long userId, String role);
    List<UserRole> findAll();
    List<UserRole> findByUser(User user);
}
