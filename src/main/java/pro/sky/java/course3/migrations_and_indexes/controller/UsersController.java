package pro.sky.java.course3.migrations_and_indexes.controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pro.sky.java.course3.migrations_and_indexes.service.UsersService;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    private UsersService usersService;

    @PostMapping("/users")
    public ResponseEntity<Void> createUser(@RequestBody User user) {
        usersService.createUser(user);
        return ResponseEntity.ok().build();
    }

    @GetMapping("'users/{id}")
    public ResponseEntity<User> getUserId(@PathVariable("id") Integer id) {
        User user = usersService.getUserById(id);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/users/name/{name}")
    public ResponseEntity<List<User>> getUsersByName(@PathVariable("name") String name) {
        List<User> users = usersService.getUserByName(name);
        return ResponseEntity.ok(users);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<Void> deleteUserById(@PathVariable("id") Integer id) {
        userService.deleteUSerById(id);
        return ResponseEntity.ok().build();
    }
}
