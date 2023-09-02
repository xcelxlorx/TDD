import org.gihae.Dollar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {

    @Test
    void test1(){
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }

    @Test
    void test2(){
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, product.amount);
        five.times(3);
        assertEquals(15, product.amount);
    }
}
