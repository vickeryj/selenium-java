package com.squarefoot;

import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SampleTest {

  @Test
  public void testGoogle() throws java.net.MalformedURLException {
    WebDriver driver  = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
    driver.navigate().to("http://www.squarefoot.com");
    driver.findElement(By.className("button")).click();
    for(int i = 0 ; i < 4 ; i++) {
      driver.findElement(By.xpath("//*[@id='app']/div/main/div/main/footer/button")).click();
    }
    driver.findElement(By.name("email")).sendKeys("josh@squarefoot.com");
    driver.findElement(By.xpath("//*[@id='app']/div/main/div/main/form/div/input[3]")).click();
    
    // driver.quit();
  }
}