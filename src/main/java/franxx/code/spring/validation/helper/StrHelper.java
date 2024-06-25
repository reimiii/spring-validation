package franxx.code.spring.validation.helper;

import org.springframework.stereotype.Component;

@Component
public class StrHelper {
    public boolean isPalindrome(String value) {
        String string = new StringBuilder(value).reverse().toString();
        return value.equals(string);
    }
}
