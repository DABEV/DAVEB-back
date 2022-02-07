package mx.edu.utez.davebback.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneNumberFormatValidator implements ConstraintValidator<PhoneNumberFormat, String> {

    private final String PATTERN_PHONE = "\\(?([0-9]{3})\\)?([ .-]?)([0-9]{3})\\2([0-9]{4})";

    @Override
    public boolean isValid(String phoneNumber, ConstraintValidatorContext context) {
        boolean isValid = false;
        
        try {
            isValid = phoneNumber.matches(PATTERN_PHONE);
        } catch (Exception e) {
            isValid = false;
        }

        return isValid;
    }
}
