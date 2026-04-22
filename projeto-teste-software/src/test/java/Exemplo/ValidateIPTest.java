package Exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ValidateIPTest {

    @Test
    public void testValidate() {
        ValidateIP validator = new ValidateIP();
        
        // IPs Válidos
        assertTrue(validator.validate("000.12.12.034"));
        assertTrue(validator.validate("121.234.12.12"));
        assertTrue(validator.validate("23.45.12.56"));
        
        // IPs Inválidos
        assertFalse(validator.validate("256.125.0.1")); 
        assertFalse(validator.validate("abc")); 
        assertFalse(validator.validate("123.456.78.90"));
    }
}