package SeleniumTasks;

import java.sql.Driver;
/*
public class JavaFaker_Task {
    @Test
    public void registration_form_test() throws InterruptedException {
        //    Note: Use JavaFaker OR read from configuration.properties file when possible.
//    1. Open browser
//    2. Go to website: https://practice.cydeo.com/registration_form
        // driver.get("https://practice.cydeo.com/registration_form");
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        Faker faker = new Faker();

        //    3. Enter first name
        WebElement firstname = Driver.getDriver().findElement(By.name("firstname"));
        firstname.sendKeys(faker.name().firstName());

//    4. Enter last name
        WebElement lastName =Driver.getDriver().findElement(By.name("lastname"));
        lastName.sendKeys(faker.name().lastName());

        //    5. Enter username
        WebElement username = Driver.getDriver().findElement(By.name("username"));
        username.sendKeys(faker.bothify("?????###"));

        //    6. Enter email address
        WebElement email = Driver.getDriver().findElement(By.name("email"));
        email.sendKeys(faker.internet().emailAddress());

//    7. Enter password
        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@type='password']"));
        password.sendKeys(faker.internet().password());
        //faker.internet().password();

//    8. Enter phone number
        WebElement phoneNum= Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phoneNum.sendKeys(faker.numerify("###-###-####"));
        //faker.numerify("###-###-####");

        //    9. Select a gender from radio buttons
        WebElement gender = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        gender.click();

//    10.Enter date of birth
        //input[@placeholder='MM/DD/YYYY']
        // "06/22/1980"
        WebElement dateOfBirth= Driver.getDriver().findElement(By.xpath("//input[@placeholder='MM/DD/YYYY']"));
        //    11.Select Department/Office
        Select office = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        office.selectByIndex(faker.number().numberBetween(1, 9));


//    12.Select Job Title
        Select jobTitle = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        jobTitle.selectByIndex(faker.number().numberBetween(1,8));

//    13.Select programming language from checkboxes

        WebElement java= Driver.getDriver().findElement(By.id("inlineCheckbox2"));
        java.click();
//    14.Click to sign up button
        WebElement submitBtn= Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
//    15.Verify success message “You’ve successfully completed registration.” is
//    displayed.
        Thread.sleep(3000); ////h4[@class='alert-heading']/following-sibling::p "//div[@class='alert alert-success']/p"
        WebElement successMsg = Driver.getDriver().findElement(By.xpath("//h4[@class='alert-heading']/following-sibling::p"));

        Assert.assertTrue(successMsg.isDisplayed());

        Driver.closeDriver();
    }
}


 */