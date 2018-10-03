package miw.iwvg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private User user;

    @BeforeEach
    void before() {
        this.user = new User(1,"Juan","Perez");
    }

    @Test
    void testFullName() {
        assertEquals("Juan Perez",user.fullName());
    }

    @Test
    void testGetName() {
        assertEquals("Juan", user.getName());
    }

    @Test
    void testGetFamilyName() {
        assertEquals("Perez", user.getFamilyName());
    }

    @Test
    void testGetNumber() {
        assertEquals(1, user.getNumber());
    }
}