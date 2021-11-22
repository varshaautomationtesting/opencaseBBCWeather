package tests.stepDefinition;

import pages.page;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static pages.page.driver;

public class StepDefs {
    private page baseTest;

    @Before
    public void initialise(){
        baseTest = new page();
        baseTest.initialise();
    }

    @Given("I navigate to BBC Website SignIn screen by entering valid logins")
    public void iNavigateToBBCWebsiteSignInScreenByEnteringValidLogins() throws InterruptedException{
        baseTest = new page();
        baseTest.bbcHome();
        Thread.sleep(2000);
        driver.getPageSource().contains("Sign in");
        driver.findElement(By.cssSelector("input#user-identifier-input")).sendKeys("varshaautomationtesting@gmail.com");
        driver.findElement(By.cssSelector("input#password-input")).sendKeys("Novm@2021");
        driver.findElement(By.cssSelector("button#submit-button")).click();
    }

    @When("I navigate to Weather tab")
    public void iNavigateToWeatherTab() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"header-content\"]/div[2]/nav/div[1]/div/div[1]/ul[2]/li[6]/a")).click();
        //driver.findElement(By.xpath("//div[@id='orb-nav-links']/ul/li[4]/a")).click();
    }

    @And("search for Newcastle-upon-tyne location")
    public void searchForNewcastleUponTyneLocation() throws InterruptedException {
        Thread.sleep(2000);
        driver.getPageSource().contains("Weather");
        driver.findElement(By.cssSelector("input#ls-c-search__input-label")).sendKeys("Newcastle-upon-tyne");
        //driver.findElement(By.xpath("//*[@id='location-list']/li[1]/a/span")).isSelected();
        driver.findElement(By.xpath("//li[@class='ls-c-locations-list-item']")).click();
        driver.findElement(By.xpath("//input[@class='ls-c-search__submit']")).click();
    }

    @Then("I can add Newcastle-upon-tyne to my location")
    public void iCanAddNewcastleUponTyneToMyLocation() throws InterruptedException {
        Thread.sleep(1000);
        driver.getPageSource().contains("Newcastle upon Tyne");
        driver.findElement(By.xpath("//*[@id='wr-location-name-id']")).isDisplayed();
        driver.findElement(By.xpath("//div[@class='ls-ui-follow-button-container']/button")).click();
        driver.quit();
    }
}