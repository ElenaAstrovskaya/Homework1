package vk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class vkTest {
    // Написать автотест, проверяющий отправку сообщений в соц. сети vk:
    //1. Залогиниться в vk
    //2. Открыть сообщения
    //3. Отправить сообщение самому себе
    //4. Проверить, что сообщение пришло.

    private WebDriver driver = new ChromeDriver();
    private static String EMAIL_USERNAME;
    private static String EMAIL_PASSWORD;

    @BeforeClass
    public void setUpData() {
        EMAIL_USERNAME = "melika@yandex.ru";
        EMAIL_PASSWORD = "5a8k9dnr";
    }

    @Test
    public void emailLoginTest() {
        driver.manage().window().maximize();
        driver.get("https://vk.com/");
        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("index_email")));

        WebElement username = driver.findElement(By.id("index_email"));
        username.sendKeys(EMAIL_USERNAME);

        WebElement password = driver.findElement(By.id("index_pass"));
        password.sendKeys(EMAIL_PASSWORD);

        // кнопка "войти"
        driver.findElement(By.id("index_login_button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // сообщения
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"l_msg\"]/a/span/span[3]")));
        WebElement messages = driver.findElement(By.xpath("//*[@id=\"l_msg\"]/a/span/span[3]"));
        messages.click();

        // поле ввода
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"im_dialogs_search\"]")));
        WebElement field = driver.findElement(By.xpath("//*[@id=\"im_dialogs_search\"]"));
        field.sendKeys("Елена Сахарова");

        // результаты поиска
        driver.findElement(By.xpath("//*[@id=\"im_dialogs\"]/li[3]/div[2]/div/div[1]/span[1]/span")).click();

        // строка поиска
        WebElement inputField = driver.findElement(By.xpath("//*[@id=\"im_editable0\"]"));
        inputField.sendKeys("Test message");

        // кнопка отправки
        driver.findElement(By.xpath("//*[@class=\"im-send-btn im-chat-input--send _im_send im-send-btn_send\"]")).click();

        // проверка отправки сообщения
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div/div[1]/div[3]/div[2]/div[3]/div/div/div[2]/div/div[1]/div/div[2]/ul/li/div[3]")));
        WebElement result = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[3]/div[2]/div[3]/div/div/div[2]/div/div[1]/div/div[2]/ul/li/div[3]"));
        if (result.isDisplayed()) {
            System.out.println("The message has been sent. Test passed");
        } else {
            System.out.println("Something has gone wrong. Test failed");
        }
    }

    @AfterClass
    public void out() {
        driver.quit();
    }
}