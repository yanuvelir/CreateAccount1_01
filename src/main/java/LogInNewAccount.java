import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInNewAccount {

    WebDriver driver3 = MainCode.driver;
    public void accountLogin() throws InterruptedException {

        Thread.sleep(2000);
        //Находим и вводи Email
        WebElement email = driver3.findElement(By.id("email"));
                  ////*[@id="__layout"]/div/div[2]/div/div/div/div[2]/div[2]/form/label[1]/div
        //*[@id="email"]
        email.sendKeys("yanautomte.st6@gmail.com");

        //Находим и вводим Password
        WebElement password = driver3.findElement(By.id("password"));
        password.sendKeys("Vinnitsa-2022");

        // //Находим и нажимаем клавишу Log in
        WebElement logBtn = driver3.findElement(By.xpath
                ("//*[@id=\"__layout\"]/div/div[2]/div/div/div/div[2]/div[2]/form/button"));
        logBtn.click();
        Thread.sleep(2500);

        driver3.quit();
    }
}
