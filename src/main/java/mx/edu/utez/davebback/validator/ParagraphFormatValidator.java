package mx.edu.utez.davebback.validator;

import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ParagraphFormatValidator implements ConstraintValidator<ParagraphFormat, String> {
    
    private final String PATTERN_PARAGRAPH = "([^À-ÿ\\u00f1\\u00d1A-Za-z0-9\\.\\,\\s]+)";

    @Override
    public boolean isValid(String paragraph, ConstraintValidatorContext context) {
        return !Pattern.matches(PATTERN_PARAGRAPH, paragraph);
    }
}
