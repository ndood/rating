package kg.ksucta.service;

import kg.ksucta.domain.user.Role;
import kg.ksucta.domain.user.User;
import kg.ksucta.domain.user.UserRole;

import java.util.List;

public interface UserRoleService {
    List<UserRole> getByRole(Role role);
    List<UserRole> getByUser(User user);
    List<UserRole> getByUserAndRole(User user, Role role);
    List<UserRole> getAll();
}
