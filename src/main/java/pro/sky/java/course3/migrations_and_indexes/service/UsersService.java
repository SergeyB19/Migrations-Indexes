package pro.sky.java.course3.migrations_and_indexes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.sky.java.course3.migrations_and_indexes.entity.User;
import pro.sky.java.course3.migrations_and_indexes.repository.UsersRepository;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public void createUser(User user) {
        usersRepository.save(user);
    }

    public User getUserById(Integer id) {
        return usersRepository.getById(id);
    }

    public void deleteUserById(Integer id) {
        usersRepository.getById(id);
    }

    public List<User> getUserByName(String name) {
        return usersRepository.getUserByName(name);
    }
}
