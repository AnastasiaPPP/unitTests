package sem_3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void checkEven(){
        assertEquals(Functioncs.evenOddNumber(2), true);
    }
    @Test
    public void checkOdd(){
        assertEquals(Functioncs.evenOddNumber(3), false);
    }
    @Test
    public void checkInterval() {
        assertEquals(Functioncs.numberInInterval(27), true);
    }
    @Test
    public void checkIntervalOut() {
        assertEquals(Functioncs.numberInInterval(2), false);
    }
}
