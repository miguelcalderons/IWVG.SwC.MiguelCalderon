package miw.iwvg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void before() {
        this.fraction = new Fraction(2,4);
    }

    @Test
    void testDecimal() {
        assertEquals(0.5, this.fraction.decimal(), 10e-5);
    }

    @Test
    void testGetNumerator() {
        assertEquals(2,this.fraction.getNumerator());
    }

    @Test
    void testGetDenominator() {
        assertEquals(4,this.fraction.getDenominator());
    }
}