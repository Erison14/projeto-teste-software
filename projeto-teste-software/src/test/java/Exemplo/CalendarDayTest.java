package Exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalendarDayTest {

    @Test
    public void testFindDay() {
        CalendarDay calendar = new CalendarDay();
       
        assertEquals("WEDNESDAY", calendar.findDay(5, 8, 2015));
    }
}