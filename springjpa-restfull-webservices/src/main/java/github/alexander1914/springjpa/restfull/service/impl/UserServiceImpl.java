package github.alexander1914.springjpa.restfull.service.impl;

import github.alexander1914.springjpa.restfull.dto.UserDTO;
import github.alexander1914.springjpa.restfull.entity.User;
import github.alexander1914.springjpa.restfull.mapper.UserMapper;
import github.alexander1914.springjpa.restfull.repository.UserRepository;
import github.alexander1914.springjpa.restfull.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Override
    public User getUserById(Long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        return optionalUser.get();
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        /// Convert UserDTO into User JPA Entity
        User user = UserMapper.mapToUser(userDTO);

        User savedUser = userRepository.save(user);

        /// Convert User JPA entity to UserDTO
        UserDTO savedUserDto = UserMapper.mapToUserDTO(savedUser);

        return savedUserDto;
    }

    @Override
    public User updateUser(User user) {
        User existingUser = userRepository.findById(user.getId()).get();

        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());

        User updatedUser = userRepository.save(existingUser);

        return updatedUser;
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
