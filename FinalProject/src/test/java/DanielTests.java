import org.junit.Assert;
import org.junit.Test;

public class DanielTests {

    @Test
    public void CartUpdatePTest() throws InterruptedException {
        String url = "https://www.saucedemo.com/";
        String UsernameSelector = "#user-name";//
        String PasswordSelector = "#password";
        String LoginSelector = "#login-button";
        String Username1Input = "standard_user";
        String PasswordInput = "secret_sauce";
        //declare
        Main selenium = new Main();
        //open window
        selenium.driver.get(url);
        selenium.driver.manage().window().maximize();
        selenium.getElement(UsernameSelector).sendKeys(Username1Input);
        selenium.getElement(PasswordSelector).sendKeys(PasswordInput);
        selenium.getElement(LoginSelector).click();
        selenium.getElement("#add-to-cart-sauce-labs-backpack").click();
        selenium.getElement("#add-to-cart-sauce-labs-fleece-jacket").click();
        selenium.getElement("#shopping_cart_container > a").click();
        Thread.sleep(1000);
        selenium.getElement("#remove-sauce-labs-backpack").click();
        Thread.sleep(1000);
        selenium.driver.quit();
    }

    @Test
    public void Shopping2Test() throws InterruptedException {
        String url = "https://www.saucedemo.com/";
        String UsernameSelector = "#user-name";//
        String PasswordSelector = "#password";
        String LoginSelector = "#login-button";
        String Username3Input = "problem_user";
        String PasswordInput = "secret_sauce";
        String Excepted = "Ben David";
        String Actual;
        //declare
        Main selenium = new Main();
        //open window
        selenium.driver.get(url);
        selenium.driver.manage().window().maximize();
        selenium.getElement(UsernameSelector).sendKeys(Username3Input);
        selenium.getElement(PasswordSelector).sendKeys(PasswordInput);
        selenium.getElement(LoginSelector).click();
        selenium.getElement("#add-to-cart-sauce-labs-backpack").click();
        selenium.getElement("#shopping_cart_container > a").click();
        selenium.getElement("#checkout").click();
        selenium.getElement("#first-name").sendKeys("Daniel");
        selenium.getElement("#postal-code").sendKeys("12345");
        selenium.getElement("#last-name").sendKeys("Ben David");
        Actual = selenium.getElement("#last-name").getText();
        Assert.assertEquals(Excepted,Actual);
        Thread.sleep(1000);
        selenium.driver.quit();
    }
}
