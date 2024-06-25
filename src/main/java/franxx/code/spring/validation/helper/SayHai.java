package franxx.code.spring.validation.helper;

import jakarta.validation.constraints.NotBlank;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@Validated
public class SayHai {

    public String hai(@NotBlank String name) {
        return "haii.. " + name;
    }
}
