package com.monosnap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MonosnapTest {
    private WebDriver driver;

    @BeforeTest
    public void startUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
//    Task 1
        {
        driver.get("https://monosnap.com/");
                Thread.sleep(5000);
        }

//    Task 2
        driver.manage().window().maximize();
        {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[3]/div[2]")).click();
                Thread.sleep(5000);
//    Task 3 - Click on the SignIn / LogIn button
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[4]/div[2]/div[1]/div/div/div[1]/div[1]/div/div[1]/div")).click();
                Thread.sleep(5000);
        }
    }
    @Test (priority = 0)
    public void clickLogIn () throws InterruptedException {
//   Task 4 - Email address
         driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[1]/input")).sendKeys("bofbaba@yahoo.com");
//    Task 5 - Password
         driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[1]/div[1]/input")).sendKeys("pa55W#rD@123");
//    Task 6 - Click on Login button
         driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/button")).click();
                Thread.sleep(1000);
         driver.findElement(By.xpath("//*[@id=\"store\"]/div[2]/div/div[2]/div[2]/div[1]/div/button")).click();
        Thread.sleep(100000);

    }
    @Test (priority = 1)
    public void createFolder () throws InterruptedException {
//    Task 8 - Delete document
         driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[4]/div/div[1]/div/div[1]/div[2]"));
                Thread.sleep(100000);
         driver.findElement(By.xpath("//*[@id=\"store\"]/div[3]/div/div/input")).sendKeys("SoftwareTest");
         driver.findElement(By.xpath("//*[@id=\"store\"]/div[3]/div/div/div[2]")).click();
                Thread.sleep(5000);
    }
    @Test (priority = 1)
    public void exitPage() throws InterruptedException {
//    Task 10 - Logout
         driver.findElement(By.xpath("//*[@id=\"store\"]/div[4]/div/div[1]/div/div[3]/div[3]")).click();
                Thread.sleep(100000);
         driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[4]/div/div[1]/div/div[1]/div[2]")).click();
                Thread.sleep(5000);
    }
    @AfterTest
    public void closeBrowser() {

          driver.quit();
    }
}


