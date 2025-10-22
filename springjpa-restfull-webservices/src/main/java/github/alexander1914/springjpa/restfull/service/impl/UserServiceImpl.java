package github.alexander1914.springjpa.restfull.service.impl;

import github.alexander1914.springjpa.restfull.entity.User;
import github.alexander1914.springjpa.restfull.repository.UserRepository;
import github.alexander1914.springjpa.restfull.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
