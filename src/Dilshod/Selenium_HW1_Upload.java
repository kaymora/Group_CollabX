
/*
package Dilshod;

import java.sql.Driver;

public class Selenium_HW1_Upload {

package com.cydeo.test.day15_upload_actions;

/*import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class TC2_UploadTest_HW {


        @Test
        public void Upload_Test_Hw() throws InterruptedException {

            //  TC #2 Upload Test
            //   1. Go to https://practice.cydeo.com/upload

            Driver.getDriver().get(ConfigurationReader.getProperty("cydeo.url"));

            //  2. Find some small file from your computer, and get the path of it.
            //   3. Upload the file.

            WebElement chooseFileElem= Driver.getDriver().findElement(By.id("file-upload"));
            chooseFileElem.sendKeys("/Users/dilshoddostiev/Downloads/some-file.txt");


            //   4. Assert:
            //   -File uploaded text is displayed on the page

            WebElement upload= Driver.getDriver().findElement(By.id("file-submit"));
            upload.click();

            WebElement resultMsg = Driver.getDriver().findElement(By.xpath("//h3[.='File Uploaded!']"));
            String actualResultMsg= resultMsg.getText();
            String expectedResultMsg= "File Uploaded!";
            Thread.sleep(3000);
            Assert.assertEquals(actualResultMsg,expectedResultMsg, "File didnt Uploaded");


            Driver.closeDriver();

        }
    }






}


 */