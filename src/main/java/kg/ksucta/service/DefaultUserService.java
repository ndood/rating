package kg.ksucta.service;


import kg.ksucta.domain.Group;
import kg.ksucta.domain.user.User;
import kg.ksucta.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@Service
public class DefaultUserService implements UserService {
    private final UserRepository userRepository;
    
    @Autowired
    public DefaultUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public UserRepository getUserRepository() {
        return userRepository;
    }

    @Override
    public Optional<User> getByEmail(String email) {
        return this.userRepository.findByEmail(email);
    }

    @Override
    public Optional<User> getByUserName(String username) {
        return this.userRepository.findByUsername(username);
    }

    @Override
    public Optional<User> getByFirstName(String firstName) {
        return this.userRepository.findByFirstName(firstName);
    }

    @Override
    public Optional<User> getByLastName(String lastName) {
        return this.userRepository.findByLastName(lastName);
    }

    @Override
    public Optional<User> getByFirstNameAndLastName(String firstName, String lastName) {
        Assert.hasText(firstName, "FirstName must not be empty!!!");
        Assert.hasText(lastName, "LastName must not be empty!!!");
        Optional<User> user = userRepository.findByFirstNameAndLastName(firstName, lastName);
        return user;
        /*if(user.isPresent()){
            return user;
        }
        throw new EntityNotFoundException("Missing User-entity with FistName and LastName:" + firstName+", "+lastName);
       */
    }

    @Override
    public List<User> getByGroup(Group group) {
        Assert.notNull(group, "Group must not be null!!!");
        return this.userRepository.findByGroup(group);
    }

    @Override
    public List<User> getByGroup_Course(String course) {
        Assert.hasText(course, "Course must not be empty!!!");
        return this.userRepository.findByGroup_Course(course);
    }

    @Override
    public List<User> getByGroupName(String groupName) {
        Assert.hasText(groupName, "Group Name must not be empty!!!");
        return this.userRepository.findByGroup_Groupname(groupName);
    }
}
