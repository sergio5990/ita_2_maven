package by.itacademy.user;

import java.util.List;

public interface UserService {

    User saveUser(String firstName, String lastName);

    List<User> getAll();
}
