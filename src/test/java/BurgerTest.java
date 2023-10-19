import org.example.Burger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BurgerTest {

    Burger burger;

    @BeforeEach
    void setUp() throws Exception {
        burger = new Burger("Hamburger", 6.19, 700);
        burger.setName("Cheese Burger");
        burger.setPrices(6.91);
        burger.setCalories(840);

    }


    @Test
    void initBurgerObjectCreation() throws Exception {
        assertEquals("Cheese Burger", burger.getName());
        assertEquals(6.91, burger.getPrices());
        assertEquals(840, burger.getCalories());
    }

}
