package franxx.code.spring.validation.helper;

import jakarta.validation.constraints.NotBlank;
import org.springframework.stereotype.Component;

@Component
public class SayHai implements MeSayHai {

    public String hai(@NotBlank String name) {
        return "haii.. " + name;
    }
}
