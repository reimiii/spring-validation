package franxx.code.spring.validation.validation;

import franxx.code.spring.validation.helper.StrHelper;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class PalindromeValidator implements ConstraintValidator<Palindrome, String> {
    @Autowired
    private StrHelper strHelper;

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return strHelper.isPalindrome(s);
    }
}
