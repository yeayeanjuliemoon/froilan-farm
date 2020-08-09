package com.zipcodewilmington.froilansfarm.farm;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class InventoryTest {

    @Test
    public void testAddToContainer() {
        Inventory inventory = new Inventory();
        CornStalk cornStalk = new CornStalk();

        inventory.addToContainer(cornStalk.yield());

        Integer expected = 1;
        Integer actual = inventory.getContainer().get(cornStalk.yield());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetContainer() {
        Inventory inventory = new Inventory();

        Assert.assertTrue(inventory.getContainer() instanceof HashMap);
    }

    @Test
    public void testRemoveFromContainer() {
        Inventory inventory = new Inventory();
        CornStalk cornStalk = new CornStalk();
        CornStalk cornStalk1 = new CornStalk();

        inventory.addToContainer(cornStalk.yield());
        inventory.addToContainer(cornStalk1.yield());

        inventory.removeFromContainer(cornStalk.yield());

        Integer expected = 1;
        Integer actual = inventory.getContainer().get(cornStalk1.yield());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetCount() {
        Inventory inventory = new Inventory();

        inventory.addToContainer(new Tomato());
        inventory.addToContainer(new Tomato());
        inventory.addToContainer(new Tomato());

        Integer expected = 3;
        Integer actual = inventory.getCount(new Tomato());

        Assert.assertEquals(expected, actual);
    }
}
