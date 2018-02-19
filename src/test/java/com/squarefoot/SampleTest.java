package com.squarefoot;

import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SampleTest {

  @Test
  public void testGoogle() throws java.net.MalformedURLException {
    WebDriver driver  = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
		driver.navigate().to("http://google.com");
  }
}