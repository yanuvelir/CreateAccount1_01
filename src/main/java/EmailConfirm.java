import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class EmailConfirm {

    WebDriver driver2 = MainCode.driver;
    public String CopyedText;

    // WebElement confCode = driver2.findElement(By.xpath
    // ("///*[@id=\"__layout\"]/div/div[2]/div/div/div/div[2]/div/label/div/input[1]"));

    public void confirmation() throws InterruptedException {
        driver2.get("https://mail.google.com");

        Thread.sleep(1500);

        // Развертывание страницы на весь экран
        driver2.manage().window().maximize();

        //Ввод Email
        WebElement inpEmail = driver2.findElement(By.xpath("//*[@id=\"identifierId\"]"));
        inpEmail.sendKeys("yanautomtest6@gmail.com");
        //yanautomtest@gmail.com

        Thread.sleep(1500);
        //Нажатие кнопки "Next"
        WebElement btnNextEmail = driver2.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
        btnNextEmail.click();

        Thread.sleep(1500);
        //Ввод пароля
        WebElement inpPass = driver2.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
        inpPass.sendKeys("Vinnitsa-2022");

        //Нажатие кнопки "Next"
        WebElement btnNextPass = driver2.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button"));
        btnNextPass.click();

        Thread.sleep(1500);
        //Открытие письма с кодом доступа
        WebElement emailOpen = driver2.findElement(By.xpath("//*[@id=\":24\"]"));
        emailOpen.click();

        Thread.sleep(2500);
        //Считывание кода
        WebElement verCode = driver2.findElement(By.xpath
                ("//div[1]/table/tbody/tr[2]/td/div/table/tbody/tr/td/p/code"));
                 //div[1]/table/tbody/tr[2]/td/div/table/tbody/tr/td/p/code
        CopyedText = verCode.getText();


        System.out.println(CopyedText);

        driver2.get("https://dex-trade.com/activate-account?email=yanautomte.st6%40gmail.com");
                                                                //yanautomtes.t6
        Thread.sleep(1500);

        // Развертывание страницы на весь экран
        driver2.manage().window().maximize();

        WebElement pasteCode = driver2.findElement(By.xpath
                ("//*[@id=\"__layout\"]/div/div[2]/div/div/div/div[2]/div/label/div/input[1]"));
        ////*[@id="__layout"]/div/div[2]/div/div/div/div[2]/div/label/div/input[1]
        pasteCode.click();
        Thread.sleep(2500);
        System.out.println(CopyedText);
        pasteCode.sendKeys(CopyedText);

    }





}