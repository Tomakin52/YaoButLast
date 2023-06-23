package tr.edu.medipol.yova;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CuzdanTest {
    private Cuzdan cuzdan;

    @Before
    public void setup() {
        cuzdan = new Cuzdan();
    }

    @Test
    public void paraYukleTest() {
        // Given: setup metodunda yeni bir Cuzdan nesnesi oluþturuldu

        // When
        cuzdan.paraYukle(100);

        // Then
        assertEquals(100, cuzdan.bakýyeSorgula(), 0.001);
    }

    @Test
    public void paraHarcaTest() {
        // Given
        cuzdan.paraYukle(100);

        // When
        cuzdan.paraHarca(50);

        // Then
        assertEquals(50, cuzdan.bakýyeSorgula(), 0.001);
    }

    @Test
    public void bakiyeSorgulaTest() {
        // Given: setup metodunda yeni bir Cuzdan nesnesi oluþturuldu

        // When: baþlangýçta hiçbir iþlem yapýlmýyor

        // Then
        assertEquals(0, cuzdan.bakýyeSorgula(), 0.001);
    }
}

