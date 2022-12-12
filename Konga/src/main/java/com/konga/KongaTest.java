package com.konga;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class KongaTest {
    private WebDriver driver;

@BeforeTest
    public void launch() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        //    Get the website
        driver.get("https://www.konga.com/");
        Thread.sleep(5000);

        driver.manage().window().maximize();
        {
        //    Click on the SignIn / LogIn button
            driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/div[4]/a")).click();
            Thread.sleep(5000);
        }
    }
@Test(priority = 0)
    public void clickLogin() throws InterruptedException {
        //    Input email address
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("thistest@mailinator.com");
        Thread.sleep(5000);
        //    Input valid password
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("pas5Word@123");
        Thread.sleep(2000);
        //    Click Log in
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();
        Thread.sleep(5000);
    }
@Test(priority = 1)
    public void myAccount() throws InterruptedException {
        //    Click my account
        driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/div[4]/div/a/span")).click();
        Thread.sleep(5000);
        //    Click Delivery Address
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[2]/div[1]/div[1]/div[2]/div/div[2]/a")).click();
        Thread.sleep(5000);
        //    Click Add New Delivery Address
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[2]/div[2]/div/div[1]/div/div/button")).click();
        Thread.sleep(3000);
        //    Input data for Delivery Address
        driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Young");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Love");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"telephone\"]")).sendKeys("09090909119");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"street\"]")).sendKeys("1, Testify Academy Avenue, Ajanlekoko Crescent");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Ilu Jogbo");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[2]/div[2]/div/div[2]/div/div/div/form/div[6]/div/div/select/option[26]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[2]/div[2]/div/div[2]/div/div/div/form/div[7]/div/div/select/option[17]")).click();
        Thread.sleep(5000);
        //    Click Continue
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[2]/div[2]/div/div[2]/div/div/div/form/div[8]/div[1]/button")).click();
        Thread.sleep(5000);
    }
//    @Test(priority = 2)
//    public void changePassword() throws InterruptedException {
//        //    Log Out
//        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[2]/div[1]/div[1]/div[2]/div/div[1]/a")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//*[@id=\"filterForm\"]/div[4]/div/input[1]")).sendKeys("pas5W#rd@123");
//        Thread.sleep(30000);
//        driver.findElement(By.xpath("//*[@id=\"filterForm\"]/div[5]/div/input[1]")).sendKeys("pas5Word@123");
//        Thread.sleep(30000);
//        driver.findElement(By.xpath("//*[@id=\"filterForm\"]/div[6]/div/input[1]")).sendKeys("pas5Word@123");
//        Thread.sleep(30000);
//        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[2]/div[1]/div[1]/div[2]/div/div[1]/a")).click();
//        Thread.sleep(5000);
//    }

@Test(priority = 3)
    public void logOut() throws InterruptedException {
        //    Log Out
        driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/div[4]/div/a/svg/path")).click();
        Thread.sleep(5000);
        driver.findElement(By.partialLinkText("/account/delivery-addresses?logout=true")).click();
        Thread.sleep(30000);
    }

@Test(priority = 4)
    public void otherTests() throws InterruptedException {
//          Negative Test
    //    Empty fields test
        driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/div[4]/a")).click();
        Thread.sleep(5000);
    //    Input valid email address
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("");
        Thread.sleep(5000);
    //    Input invalid password
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
        Thread.sleep(5000);
    //    Click Log in
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();
        Thread.sleep(5000);

    //    Invalid Email test
        //    Click on the SignIn / LogIn button
        driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/div[4]/a")).click();
        Thread.sleep(5000);
        //    Input invalid email address
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("thistestmailinator.com");
        Thread.sleep(5000);
        //    Input valid password
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("pas5Word@123");
        Thread.sleep(5000);
        //    Click Log in
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();
        Thread.sleep(5000);

        //    Invalid Password test
        driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/div[4]/a")).click();
        Thread.sleep(5000);
        //    Input valid email address
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("thistest@mailinator.com");
        Thread.sleep(5000);
        //    Input invalid password
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("pas");
        Thread.sleep(5000);
        //    Click Log in
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();
        Thread.sleep(5000);

    }
@AfterTest
    public void closeBrowser() {
            driver.quit();
    }










//            Edit existing address
//            *[@id="mainContent"]/div[2]/div[2]/div/div[2]/div/div/div/form/div/a[2] Edit
//            *[@id="street"] 1, Testify Academy Avenue, Ajanlekoko Crescent
//            *[@id="city"] Ilu Jogbo
//            *[@id="mainContent"]/div[2]/div[2]/div/div[2]/div/div/div/form/div[6]/div/div/select/option[25] Lagos
//            *[@id="mainContent"]/div[2]/div[2]/div/div[2]/div/div/div/form/div[7]/div/div/select/option[16] Mushin
//            *[@id="mainContent"]/div[2]/div[2]/div/div[2]/div/div/div/form/div[8]/div[1]/button Save Changes
//
//
//            Create new address
//            *[@id="firstname"] Young
//            *[@id="lastname"] Love
//            *[@id="telephone"] 09090909119
//            *[@id="street"] 1, Testify Academy Avenue, Ajanlekoko Crescent
//            *[@id="city"] Ilu Jogbo
//            *[@id="mainContent"]/div[2]/div[2]/div/div[2]/div/div/div/form/div[6]/div/div/select Lagos
//            *[@id="mainContent"]/div[2]/div[2]/div/div[2]/div/div/div/form/div[6]/div/div/svg
//
//            *[@id="mainContent"]/div[2]/div[2]/div/div[2]/div/div/div/form/div[7]/div/div/select Mushin
//            *[@id="mainContent"]/div[2]/div[2]/div/div[2]/div/div/div/form/div[7]/div/div/svg
//
//            *[@id="mainContent"]/div[2]/div[2]/div/div[2]/div/div/div/form/div[8]/div[1]/button












        }

