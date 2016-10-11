package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by Doroh on 11.10.2016.
 */
public class RectangleTest {
    @org.testng.annotations.Test
    public void testArea(){
        Rectangle r = new Rectangle(10,40);
        Assert.assertEquals(r.area(),400.0);
    }
}
