package com.sample.build.maven.java;

/**
 * Hello world!
 *
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;

public class App  {
    public static void main(String[] args) {

  // Optional, if not specified, WebDriver will search your path for chromedriver.

try {
 // System.setProperty("webdriver.chrome.driver", "/home/ec2-user/Downloads/chromedriver");
  System.setProperty("webdriver.chrome.driver", "c:\chromedriver\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("http://www.google.com/xhtml");
  Thread.sleep(5000);  // Let the user actually see something!
  WebElement searchBox = driver.findElement(By.name("q"));
  searchBox.sendKeys("ChromeDriver");
  searchBox.submit();
  Thread.sleep(5000);  // Let the user actually see something!
  driver.quit();
} catch (Exception e) {System.out.println(e);}
/*
        // Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
        WebDriver driver = new FirefoxDriver();

        // And now use this to visit Google
        driver.get("http://www.google.com");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));

        // Enter something to search for
        element.sendKeys("Cheese!");

        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());
        
        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("cheese!");
            }
        });

        // Should see: "cheese! - Google Search"
        System.out.println("Page title is: " + driver.getTitle());
        
        //Close the browser
        driver.quit();
*/

    }
}



/*
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
*/
