import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CrAccInput extends EmailConfirm{

    WebDriver driver1 = MainCode.driver;

    WebElement emailInput = driver1.findElement(By.id("email"));

    WebElement passwordInput = driver1.findElement(By.id
            ("password"));

    WebElement chkBoxAgree = driver1.findElement(By.xpath
            ("//*[@id=\"__layout\"]/div/div[2]/div/div/div/div[4]/form/div[2]/div/div[1]/label"));

    WebElement crAccBtn = driver1.findElement(By.xpath
            ("//*[@id=\"__layout\"]/div/div[2]/div/div/div/div[4]/form/button"));

    String currentUrl = driver1.getCurrentUrl();


    public void CrAccount(String email, String pass) throws InterruptedException {

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        emailInput.sendKeys(email);
        passwordInput.sendKeys(pass);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        chkBoxAgree.click();
        crAccBtn.click();
        Thread.sleep(2500);
        String currentUrl = driver1.getCurrentUrl();
        System.out.println(currentUrl);
        final var URL = currentUrl.toString();

         System.out.println(URL);
    }


    public void CurrentUrl( )
    {
        driver1.get(this.currentUrl);

        WebElement enterEmailConfCod = driver1.findElement(By.xpath
                ("//*[@id=\"__layout\"]/div/div[2]/div/div/div/div[2]/div/label/div/input[1]"));
        enterEmailConfCod.sendKeys(CopyedText);

    }
}