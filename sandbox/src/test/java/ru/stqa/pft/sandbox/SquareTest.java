package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.*;


/**
 * Created by Doroh on 11.10.2016.
 */
public class SquareTest {
    @org.testng.annotations.Test
            public void testArea() {
        Square s = new Square(10);
        Assert.assertEquals(s.area(), 100.0);

    }
}

