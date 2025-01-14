import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.io.File;


public class SeleniumRun
{
    public  static void main(String[] args) throws FileNotFoundException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // načítanie zoznamu url z csv suboru
        ArrayList <String> urls = new ArrayList<>();

        String zoznamURL = "C:\\Users\\malik\\OneDrive\\Počítač\\zoznamURL.csv";
        File file = new File(zoznamURL);

        if  (!file.exists())
        {
            System.out.println("Súbor s názvom " + zoznamURL + " neexistuje");
            driver.quit();
        }


       try (BufferedReader citac = new BufferedReader(new FileReader(zoznamURL)))
       { String line;

        while ((line= citac.readLine()) != null)
           {
               urls.add(line.trim());
           }
       }
       catch (IOException e) {

           System.out.println("Zle načítaný súbor" +e.getMessage());

           throw new RuntimeException(e);
       }


       for (String url : urls)

       {
               driver.get(url);
               driver.findElement(By.id("applyForm_firstName")).sendKeys("Veronika");
               driver.findElement(By.id("applyForm_surname")).sendKeys("Malíková");
               driver.findElement(By.id("applyForm_email")).sendKeys("malikova.nika@gmail.com");
               WebElement cv = driver.findElement(By.id("applyForm_fileFirst"));
               cv.sendKeys("C:/Users/malik/OneDrive/Počítač/Zivotopisy/CV_VeronikaMalikova.pdf");
               driver.findElement(By.id("applyForm_agreement")).click();
               //driver.findElement(By.id("applyForm_submit")).click();


        }
        //chromeDriver.quit();
    }
}





