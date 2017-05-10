package kg.ksucta.repository;

import kg.ksucta.domain.user.UserRole;

import java.util.Optional;

public interface CustomUserRoleRepository {
    Optional<UserRole> findByRole(String role);
    Optional<UserRole> findByUserId(Long userId);
    Optional<UserRole> findByUserIdAndRole(String userId, String role);
    Optional<UserRole> findAll();
}
