package tddbyexample.ch5;

import org.junit.Test;
import static org.junit.Assert.*;

public class DollarTest {
    
     @Test
     public void testMultiplication() {
         Money five= Money.dollar(5);
         assertEquals(Money.dollar(10), five.times(2));
         assertEquals(Money.dollar(15), five.times(3));        
     }
     @Test
     public void testMultiplicationByZero() {
         Money five= Money.dollar(5);
         Money product= five.times(0);
         assertEquals(Money.dollar(0), product);        
     }
     
     @Test
     public void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
     }
       
}
