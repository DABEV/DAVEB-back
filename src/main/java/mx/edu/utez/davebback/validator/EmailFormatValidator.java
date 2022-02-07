package mx.edu.utez.davebback.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailFormatValidator implements ConstraintValidator<EmailFormat, String>{

    private final String PATTERN_EMAIL = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        return email.matches(PATTERN_EMAIL);
    }
}
