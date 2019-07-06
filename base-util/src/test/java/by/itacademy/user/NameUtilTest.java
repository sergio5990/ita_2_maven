package by.itacademy.user;

import by.itacademy.base.util.NameUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameUtilTest {

    @Test
    void formatName() {
        String result = NameUtil.formatName("first", "second");
        assertEquals("first second", result);
    }
}