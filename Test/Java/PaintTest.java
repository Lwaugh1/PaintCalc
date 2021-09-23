package Java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaintTest {

    @Test
    public void testGetPaintColour(){
        Paint paint = new Paint("Blue", 10);
        assertEquals("Blue", paint.getColour(), "The colours were not returned the same");
        assertEquals(10, paint.getCoverage(), "The coverages were not returned the same");

    }

}
