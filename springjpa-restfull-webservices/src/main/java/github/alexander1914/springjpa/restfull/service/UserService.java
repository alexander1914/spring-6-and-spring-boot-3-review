package github.alexander1914.springjpa.restfull.service;

import github.alexander1914.springjpa.restfull.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserService {
    User getUserById(Long userId);
    List<User> getAllUser();
    User createUser(User user);
    User updateUser(User user);
    void deleteUser(Long userId);
}
