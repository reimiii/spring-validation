package franxx.code.spring.validation;

import franxx.code.spring.validation.data.Foo;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class PalindromeTest {

    @Autowired
    private Validator validator;

    @Test
    void validTest() {
        Set<ConstraintViolation<Foo>> kodok = validator.validate(Foo.of("kodok"));
        assertTrue(kodok.isEmpty());
    }

    @Test
    void nonValid() {
        Set<ConstraintViolation<Foo>> mee = validator.validate(Foo.of("mee"));
        assertFalse(mee.isEmpty());
        assertEquals(1, mee.size());

    }

    @Test
    void nonValidMessageResources() {
        Set<ConstraintViolation<Foo>> mee = validator.validate(Foo.of("mee"));
        assertFalse(mee.isEmpty());
        assertEquals(1, mee.size());

        assertEquals("not valid palindrome", mee.stream().findFirst().get().getMessage());
    }
}
