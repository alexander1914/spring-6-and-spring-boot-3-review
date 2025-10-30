package github.alexander1914.springjpa.restfull.service.impl;

import github.alexander1914.springjpa.restfull.dto.UserDTO;
import github.alexander1914.springjpa.restfull.entity.User;
import github.alexander1914.springjpa.restfull.mapper.UserMapper;
import github.alexander1914.springjpa.restfull.repository.UserRepository;
import github.alexander1914.springjpa.restfull.service.UserService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    private ModelMapper modelMapper;

    @Override
    public UserDTO getUserById(Long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        User user = optionalUser.get();
        /// Convert UserDTO into User JPA Entity
        //return UserMapper.mapToUserDTO(user);
        /// Model Mapper
        return modelMapper.map(user, UserDTO.class);
    }

    @Override
    public List<UserDTO> getAllUser() {
        List<User> users = userRepository.findAll();
        //return users.stream().map(UserMapper::mapToUserDTO).collect(Collectors.toList());
        /// Model Mapper
        return users.stream().map((user) -> modelMapper.map(user, UserDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        /// Convert UserDTO into User JPA Entity
        //User user = UserMapper.mapToUser(userDTO);
        /// Model Mapper
        User user = modelMapper.map(userDTO, User.class);

        User savedUser = userRepository.save(user);

        /// Convert User JPA entity to UserDTO
        //UserDTO savedUserDto = UserMapper.mapToUserDTO(savedUser);
        /// Model Mapper
        UserDTO savedUserDto = modelMapper.map(savedUser, UserDTO.class);

        return savedUserDto;
    }

    @Override
    public UserDTO updateUser(UserDTO userDTO) {
        User existingUser = userRepository.findById(userDTO.getId()).get();

        existingUser.setFirstName(userDTO.getFirstName());
        existingUser.setLastName(userDTO.getLastName());
        existingUser.setEmail(userDTO.getEmail());

        User updatedUser = userRepository.save(existingUser);

        /// Convert User JPA entity to UserDTO
        //return UserMapper.mapToUserDTO(updatedUser);
        /// Model Mapper
        return modelMapper.map(updatedUser, UserDTO.class);
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
