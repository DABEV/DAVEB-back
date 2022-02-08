package mx.edu.utez.davebback.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.validation.FieldError;

public class ErrorCode {
    /**
     * Obtiene todos los tipos de error sin repetir de los campos enviados.
     * 
     * @param List<FieldError> fieldErrors result Objeto que contiene el resultado de las validaciones.
     * @return List<Response> Lista con todos los tipos de errores sin repetir.
     */
    public static List<Response> mapResponseErrorsFields (List<FieldError> fieldErrors) {
        // Respuesta
        List<Response> errorList = new ArrayList<Response>();
        
        // Diccionario que almacenará los tipos de error
        // TreeMap ayuda a ordenarlos
        Map<Integer, Response> errorDictionary = new TreeMap<Integer, Response>();
        
        // Objeto a ingresar en el diccionario
        Response response;

        for (FieldError e : fieldErrors) {
            response = null;
            Integer key = 0;

            // Crea el objeto de mensaje de error
            switch (e.getCode()) {
                /**
                 * Los valores al lado de los case, son los nombres de las etiquetas
                 * que son usados en las entidades para validar. 
                 */

                // 2001 - Datos requeridos
                case "NotNull":
                case "NotBlank":
                    key = 2001;
                    response = new Response( key, "Datos requeridos", "Uno o más campos requeridos se enviaron vacíos." );
                    break;
                
                // 2002 - Error de caracteres
                case "DescriptionFormat":
                case "MatriculaFormat":
                case "ParagraphFormat":
                case "NameFormat":
                    key = 2002;
                    response = new Response( key, "Error de caracteres", "Algunos campos contienen caracteres no válidos." );
                    break;

                // 2004 - Formato inválido
                case "Size":
                case "DateTimeFormat":
                case "EmailFormat":
                case "PhoneNumberFormat":
                    key = 2004;
                    response = new Response( key, "Formato inválido", "Uno o más campos contiene un formato incorrecto." );
                    break; 
            }

            // Verifica si el tipo de error ya fue ingresado al diccionario y si el response no es nulo. 
            if (!errorDictionary.containsKey(key) && response != null)
                errorDictionary.put(key, response);
        }

        // Vacia los errores en un lista
        errorDictionary.forEach((k, v) -> errorList.add(v));

        return errorList;
    }
}
