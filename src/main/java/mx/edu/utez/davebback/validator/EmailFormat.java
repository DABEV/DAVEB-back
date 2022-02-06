package mx.edu.utez.davebback.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = EmailFormatValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface EmailFormat {
    String message() default "El formato del correo es invalido.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    int code() default 2004; 
}
