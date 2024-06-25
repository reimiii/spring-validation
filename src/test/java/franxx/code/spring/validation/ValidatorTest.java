package franxx.code.spring.validation;

import franxx.code.spring.validation.data.Person;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ValidatorTest {

    @Autowired
    private Validator validator;

    @Test
    void testNotValid() {
        Set<ConstraintViolation<Person>> validate = validator.validate(Person.of("", ""));
        assertFalse(validate.isEmpty());
        assertEquals(2, validate.size());
    }

    @Test
    void validTest() {
        Set<ConstraintViolation<Person>> mee = validator.validate(Person.of("1", "mee"));
        assertTrue(mee.isEmpty());
    }
}
