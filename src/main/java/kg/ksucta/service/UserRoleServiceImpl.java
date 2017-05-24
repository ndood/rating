package kg.ksucta.service;

import io.jsonwebtoken.lang.Assert;
import kg.ksucta.domain.user.Role;
import kg.ksucta.domain.user.User;
import kg.ksucta.domain.user.UserRole;
import kg.ksucta.repository.UserRoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserRoleServiceImpl implements UserRoleService {
    private final UserRoleRepository userRoleRepository;

    public UserRoleServiceImpl(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

//    @Override
//    public List<UserRole> getByRole(Role role) {
//        Assert.notNull(role, "Role can not be empty!");
//        return userRoleRepository.findByRole(role);
//    }

    @Override
    public Optional<UserRole> getByRole(Role role){
        Assert.notNull(role, "Role can not be empty!");
        return userRoleRepository.findByRole(role);
    }

    @Override
    public List<UserRole> getByUserName(String userName) {
        Assert.hasText(userName, "SubjectName must not be empty");
        return userRoleRepository.findByUser_Username(userName);
    }

    @Override
    public List<UserRole> getByUser(User user) {
        Assert.notNull(user, "User can not be empty!");
        return userRoleRepository.findByUser(user);
    }

    @Override
    public List<UserRole> getByUserAndRole(User user, Role role) {
        Assert.notNull(user, "User can not be empty!");
        Assert.notNull(role, "Role can not be empty!");
        return userRoleRepository.findByUserAndRole(user, role);
    }

    @Override
    public List<UserRole> getAll() {
        return userRoleRepository.findAll();
    }
}
