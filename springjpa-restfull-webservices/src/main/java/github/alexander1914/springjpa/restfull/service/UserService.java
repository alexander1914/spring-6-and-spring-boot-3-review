package github.alexander1914.springjpa.restfull.service;

import github.alexander1914.springjpa.restfull.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserService {
    User createUser(User user);
}
