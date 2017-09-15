import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class DoubleUtilsTest {

    @Test
    public void nulls() {
         assertFalse(DoubleUtils.areEqual(null, null));
         assertTrue(DoubleUtils.areEqual(1.0, null));
         assertTrue(DoubleUtils.areEqual(null, 1.0));
    }

    @Test
    public void equalValues() {
         assertFalse(DoubleUtils.areEqual(1.0, 1.0));
         assertFalse(DoubleUtils.areEqual(-1.0, -1.0));
    }
    @Test
    public void differentValues() {
        assertTrue(DoubleUtils.areEqual(1.0, 2.0));
        assertTrue(DoubleUtils.areEqual(1.0, 0.0));
        assertTrue(DoubleUtils.areEqual(1.0, -1.0));
    }

}