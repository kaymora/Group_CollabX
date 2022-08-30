package SeleniumTasks;

public class TC2_Hover_Task {
    /*
    import java.util.List;

public class T3_HoverTest {

    @Test
    public void hover_test() throws InterruptedException {
        //1. Go to https://practice.cydeo.com/hovers
        Driver.getDriver().get(ConfigurationReader.getProperty("practice.cydeo.hovers"));

        //2. Hover over to first image
        WebElement firstImage= Driver.getDriver().findElement(By.xpath("(//img)[1]"));
      //  WebElement firstImage= Driver.getDriver().findElement(By.xpath("//div[@class='figure']/img"));

        WebElement nameUser= Driver.getDriver().findElement(By.xpath("//h5[text()='name: user1']"));
      //  WebElement nameUser1= Driver.getDriver().findElement(By.xpath("//div[@class='figcaption']/h5"));

        WebElement profileLink = Driver.getDriver().findElement(By.xpath("(//a[.='View profile'])[1]"));

        Actions actions= new Actions(Driver.getDriver());
        actions.moveToElement(firstImage).perform();
        actions.moveToElement(nameUser).perform();
        actions.moveToElement(profileLink).perform();
        //3. Assert:
            //a. “name: user1” is displayed

        Assert.assertTrue(nameUser.isDisplayed());
            //b. “view profile” is displayed
        Assert.assertTrue(profileLink.isDisplayed());
        //4. Hover over to second image

        //5. Assert:
            //a. “name: user2” is displayed
            //b. “view profile” is displayed
        //6. Hover over to third image
        //7. Confirm:
            //a. “name: user3” is displayed
            //b. “view profile” is displayed

        List<WebElement> images = Driver.getDriver().findElements(By.xpath("//div[@class='figure']/img"));
        for (WebElement each:images) {
            actions.moveToElement(firstImage).pause(2000).perform();


        }

        List<WebElement> name = Driver.getDriver().findElements(By.xpath("//h5[text()='name: user1']"));

        Thread.sleep(3000);
        for (WebElement each:name  ) {
            actions.moveToElement(nameUser).pause(2000).perform();
        }

        List<WebElement> profile = Driver.getDriver().findElements(By.xpath("(//a[.='View profile'])[1]"));

        for (WebElement eachLink:profile ) {
            actions.moveToElement(profileLink).pause(2000).perform();
        }
    }
}
     */
}
