package github.alexander1914.springjpa.restfull.controller;

import github.alexander1914.springjpa.restfull.dto.UserDTO;
import github.alexander1914.springjpa.restfull.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(
        name = "CRUD RESTFull APIs for Users Resources",
        description = "Get User, Get All User, Create User, Update User and Delete User"
)
@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserController {
    private UserService userService;

    @Operation(
            summary = "Get User By ID RESTFull API",
            description = "Get User By ID RESTFull API is used to get a single user on database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP Status 200 SUCCESS"
    )
    @GetMapping("{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable("id") Long userId){
       UserDTO user = userService.getUserById(userId);
       return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @Operation(
            summary = "Get All Users RESTFull API",
            description = "Get All Users RESTFull API is used to get all the users on database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP Status 200 SUCCESS"
    )
    @GetMapping
    public ResponseEntity<List<UserDTO>> getAllUsers(){
        List<UserDTO> users = userService.getAllUser();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @Operation(
            summary = "Create User RESTFull API",
            description = "Create User RESTFull API is used to create new user on database"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP Status 201 CREATED"
    )
    @PostMapping
    public ResponseEntity<UserDTO> createUser(@Valid @RequestBody UserDTO userDTO){
        UserDTO savedUser = userService.createUser(userDTO);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @Operation(
            summary = "Update User RESTFull API",
            description = "Update User RESTFull API is used to update a particular user on database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP Status 200 SUCCESS"
    )
    @PutMapping("{id}")
    public ResponseEntity<UserDTO> updateUser(@PathVariable("id") Long userId,
                                              @Valid @RequestBody UserDTO userDTO){
        userDTO.setId(userId);
        UserDTO updateUser = userService.updateUser(userDTO);
        return new ResponseEntity<>(updateUser, HttpStatus.OK);
    }

    @Operation(
            summary = "Delete User RESTFull API",
            description = "Delete User RESTFull API is used to delete a particular user on database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP Status 200 SUCCESS"
    )
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId){
        userService.deleteUser(userId);
        return new ResponseEntity<>("User successfully deleted", HttpStatus.OK);
    }
}
