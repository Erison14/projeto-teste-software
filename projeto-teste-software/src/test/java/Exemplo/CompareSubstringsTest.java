package Exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompareSubstringsTest {

    @Test
    public void testGetSmallestAndLargest() {
        CompareSubstrings comp = new CompareSubstrings();
        String resultadoEsperado = "ava\nwel";
        
        assertEquals(resultadoEsperado, comp.getSmallestAndLargest("welcometojava", 3));
    }
}