import org.junit.Assert;
import org.junit.Test;

public class IsayasTests {

    @Test
    public void Shopping1Test() throws InterruptedException {
        String url = "https://www.saucedemo.com/";
        String UsernameSelector = "#user-name";//
        String PasswordSelector = "#password";
        String LoginSelector = "#login-button";
        String Username1Input = "standard_user";
        String PasswordInput = "secret_sauce";
        String FirstNameSelector = "#first-name";
        String LastNameSelector = "#last-name";
        String ZipCode = "#postal-code";
        String CountinueSelector = "#continue";
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
        selenium.getElement("#checkout").click();
        selenium.getElement(FirstNameSelector).sendKeys("Hudi");
        selenium.getElement(LastNameSelector).sendKeys("Hoatifa");
        selenium.getElement(ZipCode).sendKeys("100043");
        selenium.getElement(CountinueSelector).click();
        selenium.getElement("#finish").click();
        Thread.sleep(1500);
        selenium.driver.quit();
    }

    @Test
    public void ProductNameTest() throws InterruptedException {
        String url = "https://www.saucedemo.com/";
        String UsernameSelector = "#user-name";//
        String PasswordSelector = "#password";
        String LoginSelector = "#login-button";
        String Username3Input = "problem_user";
        String PasswordInput = "secret_sauce";
        String Expected = "Sauce Labs Backpack";
        String Actual;
        //declare
        Main selenium = new Main();
        //open window
        selenium.driver.get(url);
        selenium.driver.manage().window().maximize();
        selenium.getElement(UsernameSelector).sendKeys(Username3Input);
        selenium.getElement(PasswordSelector).sendKeys(PasswordInput);
        selenium.getElement(LoginSelector).click();
        selenium.getElement("#item_4_title_link > div").click();
        Actual = selenium.getElement("#inventory_item_container > div > div > div.inventory_details_desc_container > div.inventory_details_name.large_size").getText();
        Assert.assertEquals(Expected,Actual);
        Thread.sleep(1000);
        selenium.driver.quit();
    }
}
