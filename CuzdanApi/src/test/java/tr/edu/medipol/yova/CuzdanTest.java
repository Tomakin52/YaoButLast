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
        // Given: setup metodunda yeni bir Cuzdan nesnesi olu�turuldu

        // When
        cuzdan.paraYukle(100);

        // Then
        assertEquals(100, cuzdan.bak�yeSorgula(), 0.001);
    }

    @Test
    public void paraHarcaTest() {
        // Given
        cuzdan.paraYukle(100);

        // When
        cuzdan.paraHarca(50);

        // Then
        assertEquals(50, cuzdan.bak�yeSorgula(), 0.001);
    }

    @Test
    public void bakiyeSorgulaTest() {
        // Given: setup metodunda yeni bir Cuzdan nesnesi olu�turuldu

        // When: ba�lang��ta hi�bir i�lem yap�lm�yor

        // Then
        assertEquals(0, cuzdan.bak�yeSorgula(), 0.001);
    }
}

