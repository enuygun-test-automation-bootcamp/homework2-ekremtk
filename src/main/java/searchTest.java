import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.ArrayList;
import java.util.List;

public class searchTest
{
    public static void main(String[] args)
    {

        System.out.println("Welcome to Browser Test");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();    // Set the Web Page to maximum size

        String url = "https://demoqa.com/webtables";    // Web page adress
        driver.get(url);    // Web Page opened

        List<WebElement> webElementList = new ArrayList();  // Web Elements added as Array List

        webElementList = driver.findElements(By.xpath("//div[@class='rt-tr-group']/div[1]/div[1]")); // Find the texts at first column in the table
        for (int i = 0; i < webElementList.size(); i++)
        {
            System.out.println(webElementList.get(i).getText());   // Get the texts and write them at new lines
        }

        System.out.println("**********---------------RESULTS---------------**********");

        List<WebElement> parentWebElements = new ArrayList<>();
        parentWebElements = driver.findElements(By.xpath("//div[@class='rt-tr-group']/div[1]"));
        System.out.println(webElementList.get(0).getText());        // Write the first name


        System.out.println("**********---------------RESULTS---------------**********");


        Customers customerList = new Customers();

        for (int i = 0; i < customerList.customerList.size(); i++)
        {
            System.out.println(customerList.customerList.get(i));       // Write all the names at the customer list
        }

        System.out.println("**********---------------RESULTS---------------**********");

        if (customerList.customerList.get(0).equals(webElementList.get(0).getText()))
        {
            System.out.println("First Elements are equal");
        }

        System.out.println("**********---------------RESULTS---------------**********");

        // First the searchBox object created
        // Then click the button
        // At least write Selenium for testing
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='searchBox']"));
        searchBox.click();
        searchBox.sendKeys("Selenium");

        System.out.println("**********---------------RESULTS---------------**********");

        List<WebElement> webElementList2 = new ArrayList();  // Web Elements added as Array List

        webElementList2 = driver.findElements(By.xpath("//div[@class='rt-tr-group']/div[1]/div[1]")); // Find the texts at first column in the table
        for (int i = 0; i < webElementList2.size(); i++)
        {
            System.out.println(webElementList2.get(i).getText());   // Get the texts and write them at new lines
        }

        System.out.println("**********---------------RESULTS---------------**********");

        WebElement searchResult = driver.findElement(By.xpath("//div[contains(text(),'No rows found')]"));
        System.out.println(searchResult);

    }
}
