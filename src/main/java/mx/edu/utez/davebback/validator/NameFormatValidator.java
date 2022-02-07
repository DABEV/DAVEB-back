package mx.edu.utez.davebback.validator;

import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NameFormatValidator implements ConstraintValidator<NameFormat, String> {
    
    private final String PATTERN_NAME = "^([À-ÿ\\u00f1\\u00d1A-Za-z\\s])";

    @Override
    public boolean isValid(String name, ConstraintValidatorContext context) {
        return !Pattern.matches(PATTERN_NAME, name);
    }
}
