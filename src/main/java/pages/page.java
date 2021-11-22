package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class page {
    public static WebDriver driver;

    public void initialise(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sankar\\IdeaProjects\\selenium-test-starter-java\\src\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.bbc.co.uk/");
        driver.manage().window().maximize();
    }

    public void bbcHome(){
        WebElement hover = driver.findElement(By.xpath("//*[@class='ssrcss-qgttmg-AccountText eki2hvo4']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(hover).perform();
        driver.findElement(By.xpath("//span[@class='ssrcss-qgttmg-AccountText eki2hvo4']")).click();
    }

}