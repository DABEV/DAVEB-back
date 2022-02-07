package mx.edu.utez.davebback.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MatriculaFormatValidator implements ConstraintValidator<MatriculaFormat, String>{

    private final String PATTERN_MATRICULA = "[^A-Z0-9]+";

    @Override
    public boolean isValid(String matricula, ConstraintValidatorContext context) {
        boolean isValid = false;
        
        try {
            Pattern pattern = Pattern.compile(PATTERN_MATRICULA);
            Matcher matcher = pattern.matcher(matricula);
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
