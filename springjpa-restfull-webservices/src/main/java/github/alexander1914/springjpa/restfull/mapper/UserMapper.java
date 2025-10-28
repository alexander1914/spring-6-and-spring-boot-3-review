package github.alexander1914.springjpa.restfull.mapper;

import github.alexander1914.springjpa.restfull.dto.UserDTO;
import github.alexander1914.springjpa.restfull.entity.User;

public class UserMapper {

    /// Mapping User JPA Entity into UserDTO
    public static UserDTO mapToUserDTO(User user){
        UserDTO userDTO = new UserDTO(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail()
        );
        return userDTO;
    }

    /// Mapping UserDTO into User JPA Entity
    public static User mapToUser(UserDTO userDTO){
        User user = new User(
                userDTO.getId(),
                userDTO.getFirstName(),
                userDTO.getLastName(),
                userDTO.getEmail()
        );
        return user;
    }
}
