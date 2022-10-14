package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import org.junit.jupiter.api.Assertions;

public class FlowerTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private static final int MAX_SEPAL = 100;
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower();
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        Assertions.assertEquals(price, flower.getPrice());
    }

    @Test
    public void testColor() {
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
        Assertions.assertEquals("#FF0000", flower.getColor());
    }

    @Test
    public void testsepalLength() {
        int sepal = RANDOM_GENERATOR.nextInt(MAX_SEPAL);
        flower.setSepalLength(sepal);
        Assertions.assertEquals(sepal, flower.getSepalLength());
    }
    @Test
    public void testFlowerType()
    {
        FlowerType type = FlowerType.ROSE;
        Assertions.assertEquals(type, FlowerType.ROSE);
    }
}
