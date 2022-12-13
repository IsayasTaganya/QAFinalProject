import org.junit.Assert;
import org.junit.Test;

public class SwagLabsTests {

    @Test
    public void ShoppingPTest() throws InterruptedException {
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
    public void ShoppingCartUpdatePTest() throws InterruptedException {
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
    public void LockedUserNTest() throws InterruptedException {
        String url = "https://www.saucedemo.com/";
        String UsernameSelector = "#user-name";//
        String PasswordSelector = "#password";
        String LoginSelector = "#login-button";
        String Username2Input = "locked_out_user";
        String PasswordInput = "secret_sauce";
        String Expected = "https://www.saucedemo.com/inventory.html";
        String Actual;
        //declare
        Main selenium = new Main();
        //open window
        selenium.driver.get(url);
        selenium.driver.manage().window().maximize();
        selenium.getElement(UsernameSelector).sendKeys(Username2Input);
        selenium.getElement(PasswordSelector).sendKeys(PasswordInput);
        selenium.getElement(LoginSelector).click();
        Actual = selenium.driver.getCurrentUrl();
        Assert.assertEquals(Actual,Expected);
        Thread.sleep(1000);
        selenium.driver.quit();
    }

    @Test
    public void ProductNameBUGTest() throws InterruptedException {
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

    @Test
    public void ShoppingGUIbugTest() throws InterruptedException {
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

    @Test
    public void SortOptionBUGTest() throws InterruptedException {
        String url = "https://www.saucedemo.com/";
        String UsernameSelector = "#user-name";//
        String PasswordSelector = "#password";
        String LoginSelector = "#login-button";
        String Username3Input = "problem_user";
        String PasswordInput = "secret_sauce";
        String Expected = "Price (low to high)";
        String Actual;
        //declare
        Main selenium = new Main();
        //open window
        selenium.driver.get(url);
        selenium.driver.manage().window().maximize();
        selenium.getElement(UsernameSelector).sendKeys(Username3Input);
        selenium.getElement(PasswordSelector).sendKeys(PasswordInput);
        selenium.getElement(LoginSelector).click();
        selenium.getElement("#header_container > div.header_secondary_container > div.right_component > span > select").click();
        Actual = selenium.getElement("#header_container > div.header_secondary_container > div.right_component > span > span").getText();
        Assert.assertEquals(Expected,Actual);
        Thread.sleep(1000);
        selenium.driver.quit();
    }

}
