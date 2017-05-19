package kg.ksucta.service;

import kg.ksucta.domain.user.Role;
import kg.ksucta.domain.user.User;
import kg.ksucta.domain.user.UserRole;

import java.util.List;
import java.util.Optional;

public interface UserRoleService {
    Optional<UserRole> getByRole(Role role);
    Optional<UserRole> getByUser(User user);
    List<UserRole> getByUserAndRole(User user, Role role);
    List<UserRole> getAll();
}
