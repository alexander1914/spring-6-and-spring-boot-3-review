package github.alexander1914.springjpa.restfull.service;

import github.alexander1914.springjpa.restfull.dto.UserDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserService {
    UserDTO getUserById(Long userId);
    List<UserDTO> getAllUser();
    UserDTO createUser(UserDTO userDTO);
    UserDTO updateUser(UserDTO userDTO);
    void deleteUser(Long userId);
}
