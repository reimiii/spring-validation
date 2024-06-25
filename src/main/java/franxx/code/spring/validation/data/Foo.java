package franxx.code.spring.validation.data;

import franxx.code.spring.validation.validation.Palindrome;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
public class Foo {
    @Palindrome
    private String bar;
}
