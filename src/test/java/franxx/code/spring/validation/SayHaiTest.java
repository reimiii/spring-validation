package franxx.code.spring.validation;

import franxx.code.spring.validation.helper.SayHai;
import jakarta.validation.ConstraintViolationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SayHaiTest {

    @Autowired
    private SayHai sayHai;

    @Test
    void valid() {
        Assertions.assertEquals("haii.. me", sayHai.hai("me"));
    }

    @Test
    void invalid() {
        Assertions.assertThrows(ConstraintViolationException.class, () -> {
           sayHai.hai("");
        });
    }
}
