package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by Doroh on 11.10.2016.
 */
public class CircleTest {
    @org.testng.annotations.Test
    public void testCircle(){
        Circle x = new Circle(10);
        Assert.assertEquals(x.area(),314.0);
    }
}
