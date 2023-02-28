package praktikum;


import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BunTest {
    private Bun testBun;
    private String bunName;
    private Float bunPrice;

    @Before
    public void createInstance() {
        bunName = RandomStringUtils.randomAlphabetic(15);
        bunPrice = (float) Math.random();
        testBun = new Bun(bunName, bunPrice);
    }

    @Test
    public void checkBunGetNameTest() {
        assertEquals(bunName, testBun.getName());
    }

    @Test
    public void checkBunGetPriceTest() {
        assertEquals(bunPrice, testBun.getPrice(), 0.0f);
    }
}
