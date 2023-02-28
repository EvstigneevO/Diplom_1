package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IngredientParameterizedTest {
    private final IngredientType type;
    private final String name;
    private final float price;

    public IngredientParameterizedTest(IngredientType type, String name, float price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters(name = "{index} : type = {0}")
    public static Object[][] getIngredientData() {
        return new Object[][]{
                {IngredientType.SAUCE, "cheese sauce", 14.88f},
                {IngredientType.FILLING, "bacon", 116.51f},
                {null, null, 0.0f}
        };
    }

    @Test
    public void getTypeTest() {
        Ingredient ingredient = new Ingredient(type, name, price);
        IngredientType actual = ingredient.getType();
        assertEquals(type, actual);
    }
}
