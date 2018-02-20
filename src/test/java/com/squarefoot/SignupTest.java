package com.squarefoot;

import java.net.URL;
import java.util.UUID;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupTest {

  @Test
  public void testSignup() throws java.net.MalformedURLException {
    WebDriver driver  = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
    try {
      driver.navigate().to("https://www.squarefoot.com");
      driver.findElement(By.xpath("//a[contains(text(), 'Get Started')]")).click();
      driver.findElement(By.xpath("//button[contains(text(), '1 / 5 >')]")).click();
      driver.findElement(By.xpath("//button[contains(text(), '2 / 5 >')]")).click();
      driver.findElement(By.xpath("//button[contains(text(), '3 / 5 >')]")).click();
      driver.findElement(By.xpath("//button[contains(text(), '4 / 5 >')]")).click();
      driver.findElement(By.name("email")).sendKeys("josh+" + UUID.randomUUID() + "@squarefoot");
      driver.findElement(By.name("phone")).sendKeys("123");
      driver.findElement(By.xpath("//input[@value='See Your Results']")).click();
      WebDriverWait wait = new WebDriverWait(driver, 4);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(), 'Your office space search, all in one space')]")));
    }
    finally {
      // driver.quit();
    }
  }
}