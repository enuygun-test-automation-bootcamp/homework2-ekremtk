import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class searchBoxTest
{
    public static void main(String[] args)
    {

        System.out.println("Welcome to Browser Test");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();    // Set the Web Page to maximum size

        String url = "https://demoqa.com/webtables";    // Web page adress
        driver.get(url);    // Web Page opened

        System.out.println("**********---------------RESULTS---------------**********");


        // First the searchBox object created
        // Then click the button
        // At least write Selenium for testing
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='searchBox']"));
        searchBox.click();
        searchBox.sendKeys("Selenium");

        System.out.println("Selenium text sended to the search box");

        System.out.println("**********---------------RESULTS---------------**********");

        // Web Elements added as Array List
        List<WebElement> webElementList2 = new ArrayList();

        // Find the texts at first column in the table
        webElementList2 = driver.findElements(By.xpath("//div[@class='rt-tr-group']/div[1]/div[1]"));
        for (int i = 0; i < webElementList2.size(); i++)
        {
            // Get the texts and write them at new line
            System.out.println(webElementList2.get(i).getText());
        }

        System.out.println("**********---------------RESULTS---------------**********");

        WebElement searchResult = driver.findElement(By.xpath("//div[contains(text(),'No rows found')]"));
        System.out.println(searchResult);

    }
}
