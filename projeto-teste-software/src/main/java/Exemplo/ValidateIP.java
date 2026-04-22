
package Exemplo;

public class ValidateIP {
    
    public boolean validate(String ip) {
        if (ip == null) {
            return false;
        }
        
        // Padrão Regex para validar números de 0 a 255
        String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        String regex = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
        
        return ip.matches(regex);
    }
}