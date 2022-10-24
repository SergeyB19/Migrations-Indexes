package pro.sky.java.course3.migrations_and_indexes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.sky.java.course3.migrations_and_indexes.entity.User;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {

    List<User> getUserByName(String name);
}
