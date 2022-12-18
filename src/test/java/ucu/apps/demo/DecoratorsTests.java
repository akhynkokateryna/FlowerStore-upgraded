package ucu.apps.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ucu.apps.demo.decorators.BasketDecorator;
import ucu.apps.demo.decorators.PaperDecorator;
import ucu.apps.demo.decorators.RibbonDecorator;
import ucu.apps.demo.flower.Flower;

public class DecoratorsTests {
    private final Flower flower = new Flower();
    private final BasketDecorator basketDecorator = new BasketDecorator(flower);
    private final PaperDecorator paperDecorator = new PaperDecorator(flower);
    private final RibbonDecorator ribbonDecorator = new RibbonDecorator(flower);

    @Test
    public void testPrice(){
        flower.setPrice(100);
        Assertions.assertEquals(basketDecorator.price(), 104);
        Assertions.assertEquals(paperDecorator.price(), 113);
        Assertions.assertEquals(ribbonDecorator.price(), 140);
    }

    @Test
    public void testDescriptions(){
        flower.setPrice(100);
        Assertions.assertEquals(basketDecorator.getDescription(), "The item you chose is " +
                flower.getClass().getSimpleName() + " and costs " + 100.0);
    }
}
