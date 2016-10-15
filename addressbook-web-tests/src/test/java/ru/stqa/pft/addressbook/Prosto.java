package ru.stqa.pft.addressbook;

import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class Prosto {
    FirefoxDriver wd;
    
    @Before
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void testProsto() {
        wd.get("https://www.skyscanner.ru/");
        wd.findElement(By.id("js-origin-input")).click();
        wd.findElement(By.id("js-origin-input")).clear();
        wd.findElement(By.id("js-origin-input")).sendKeys("Новосибирск (OVB)");
        wd.findElement(By.cssSelector("span.country-name")).click();
        wd.findElement(By.id("js-destination-input")).click();
        wd.findElement(By.id("js-destination-input")).clear();
        wd.findElement(By.id("js-destination-input")).sendKeys("Москва (Любой)");
        wd.findElement(By.cssSelector("strong.tt-highlight")).click();
        wd.findElement(By.id("js-depart-input")).click();
        wd.findElement(By.xpath("//table[@class='2016-10']/tbody/tr[5]/td[7]/a")).click();
        wd.findElement(By.id("js-return-input")).click();
        wd.findElement(By.xpath("//div[11]/div/div/div[2]/div/section/div[2]/table/tbody/tr[5]/td[7]/a")).click();
        wd.findElement(By.id("js-return-input")).click();
        wd.findElement(By.xpath("//div[11]/div/div/div[2]/div/section/div[2]/table/tbody/tr[6]/td[1]/a")).click();
        wd.findElement(By.cssSelector("button.js-search-button.bpk-button")).click();
    }
    
    @After
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
