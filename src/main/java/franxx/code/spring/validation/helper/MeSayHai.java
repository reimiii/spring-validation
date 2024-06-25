package franxx.code.spring.validation.helper;

import jakarta.validation.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;

@Validated
public interface MeSayHai {
    String hai(@NotBlank String name);
}
