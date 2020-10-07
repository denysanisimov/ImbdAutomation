import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class ImbdTests {

    private WebDriver driver;

    @Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.imdb.com");
    }
    @After
    public void cleanUp(){
        if (driver != null)
        driver.quit();
    }
    @Test
    public void checkHomeB(){
        System.out.println("Check URL");
        assertEquals( "https://www.imdb.com/", driver.getCurrentUrl());
        System.out.println("Check Title");
        assertEquals("IMDb: Ratings, Reviews, and Where to Watch the Best Movies & TV Shows" , driver.getTitle());
    }

    @Test
    public void checkBurgerM(){

    }
}
