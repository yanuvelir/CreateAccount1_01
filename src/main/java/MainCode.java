import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainCode {


    // Инициализируем Webdriver при помощи метода public Static, для автоматического использования в других классах
    public static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        // Переход на начальную страницу
        driver.get("https://dex-trade.com/");
        Thread.sleep(1500);
        // Развертывание страницы на весь экран
        driver.manage().window().maximize();

        Thread.sleep(1500);
        // Находим и нажимаем кнопку Sign Up
        WebElement signUpButton = driver.findElement(By.xpath
                ("//*[@id=\"__layout\"]/div/div[1]/div[1]/div/div/div[2]/div/div[2]/a[2]"));
        signUpButton.click();

        CrAccInput crac = new CrAccInput();
        crac.CrAccount("yanautomte.st6@gmail.com", "Vinnitsa-2022");

        //Запускаем выполнения метода "confirmation". Метод считывания
        //верификационного кода из Email
        EmailConfirm imConf = new EmailConfirm();
        imConf.confirmation();

        //Вставка верификационного кода
        //crac.CurrentUrl();

        LogInNewAccount logNewAcc = new LogInNewAccount();
        logNewAcc.accountLogin();

    }
}

}
