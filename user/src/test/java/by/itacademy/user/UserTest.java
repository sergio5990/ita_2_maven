package by.itacademy.user;

import by.itacademy.user.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void getName() {
        User user = new User("1", "1", "2");
        String name = user.getName();
        assertEquals("1 2", name);
    }
}