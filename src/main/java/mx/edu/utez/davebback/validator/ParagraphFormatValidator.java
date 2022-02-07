package mx.edu.utez.davebback.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ParagraphFormatValidator implements ConstraintValidator<ParagraphFormat, String> {
    
    private final String PATTERN_PARAGRAPH = "[^À-ÿ\\u00f1\\u00d1A-Za-z0-9\\.\\,\\s]+";

    @Override
    public boolean isValid(String paragraph, ConstraintValidatorContext context) {
        boolean isValid = false;
        
        try {
            Pattern pattern = Pattern.compile(PATTERN_PARAGRAPH);
            Matcher matcher = pattern.matcher(paragraph);
            isValid = getCountInvalidChars(matcher) == 0;
        } catch (Exception e) {
            isValid = false;
        }

        return isValid;
    }

    private int getCountInvalidChars (Matcher matcher) {
        int count = 0;
        while(matcher.find()) count++;
        return count;
    }
}
