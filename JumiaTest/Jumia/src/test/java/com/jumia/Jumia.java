package com.jumia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Jumia {

    private WebDriver driver;

    @BeforeTest
    public void startUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
//    Task 1
            driver.get("https://www.jumia.com.ng/");
            Thread.sleep(5000);


//    Task 2
        driver.manage().window().maximize();
        {
            driver.findElement(By.xpath("//*[@id=\"jm\"]/header/section/div[2]/div[1]/label")).click();
            Thread.sleep(5000);
//    Task 3 - Click on the SignIn / LogIn button
            driver.findElement(By.xpath("//*[@id=\"dpdw-login-box\"]/div/div/a")).click();
            Thread.sleep(5000);
        }
    }
    @Test(priority = 0)
    public void clickLogIn () throws InterruptedException {
//   Task 4 - Email address
        driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[2]/label/input")).sendKeys("bofbaba@yahoo.com");
        driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[3]/div/button/span[3]")).click();
        Thread.sleep(2000);
//    Task 5 - Password
        driver.findElement(By.xpath("//*[@id=\"passwordForm\"]/div[2]/div[3]/label/input")).sendKeys("pas5WorD@123");
        Thread.sleep(2000);
//    Task 6 - Click on Login button
        driver.findElement(By.xpath("//*[@id=\"loginButton\"]/span[3]")).click();
        Thread.sleep(1000);

    }
//    @Test (priority = 1)
//    public void addAddress () throws InterruptedException {
////    Task 8 - Delete document
//        driver.findElement(By.xpath("//*[@id=\"jm\"]/header/section/div[2]/div[1]/label")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"dpdw-login-box\"]/div/a[1]")).click();
//        driver.findElement(By.xpath("//*[@id=\"jm\"]/main/div/section/div/div/div[2]/article/a")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//*[@id=\"fi-phone\"]")).sendKeys("09020486696");
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//*[@id=\"fi-address1\"]")).sendKeys("1, Ajanlekoko Street, Igbayilaaro Crescent, Lagos");
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//*[@id=\"fi-regionId\"]/option[26]")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//*[@id=\"fi-cityId\"]/option[19]")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//*[@id=\"addressForm\"]/div[5]/div/button")).click();
//        Thread.sleep(5000);
//    }
    @Test (priority = 2)
    public void exitPage() throws InterruptedException {
//    Task 10 - Logout
        driver.findElement(By.xpath("//*[@id=\"jm\"]/header/section/div[2]/div[1]/label")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"dpdw-login-box\"]/div/form/button")).click();
        Thread.sleep(5000);
    }
    @AfterTest
    public void closeBrowser() {

        driver.quit();
    }


}
