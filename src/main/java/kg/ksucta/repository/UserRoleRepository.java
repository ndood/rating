package kg.ksucta.repository;

import kg.ksucta.domain.user.Role;
import kg.ksucta.domain.user.User;
import kg.ksucta.domain.user.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    Optional<UserRole> findByRole(Role role);
    Optional<UserRole> findByUser(User user);
    Optional<UserRole> findByUserAndRole(User user, Role role);
    List<UserRole> findAll();               //jpa требует только List<>, т.е. не получится Optional
}
