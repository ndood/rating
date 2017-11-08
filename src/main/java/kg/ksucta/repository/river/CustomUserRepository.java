package kg.ksucta.repository.river;

import kg.ksucta.domain.river.user.User;

import java.util.Optional;

public interface CustomUserRepository {
    public Optional<User> findByEmail(String email);
    public Optional<User> findByLastname(String lastname);
    public Optional<User> findByFirstname(String firstname);
    public Optional<User> findByRoomId(Long room);
}
