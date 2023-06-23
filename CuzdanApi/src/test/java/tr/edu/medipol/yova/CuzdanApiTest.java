package tr.edu.medipol.yova;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CuzdanApiTest {
    private CuzdanApi cuzdanApi;

    @Before
    public void setup() {
        cuzdanApi = new CuzdanApi();
    }

    @Test
    public void testParaYukle() {
        cuzdanApi.paraYukle(100.0);
        assertEquals(100.0, cuzdanApi.bakiyeSorgula(), 0.0);
    }

    @Test
    public void testParaHarca() {
        cuzdanApi.paraYukle(200.0);
        cuzdanApi.paraHarca(50.0);
        assertEquals(150.0, cuzdanApi.bakiyeSorgula(), 0.0);
    }

    @Test
    public void testBakiyeSorgula() {
        assertEquals(0.0, cuzdanApi.bakiyeSorgula(), 0.0);
        cuzdanApi.paraYukle(500.0);
        assertEquals(500.0, cuzdanApi.bakiyeSorgula(), 0.0);
    }
}
