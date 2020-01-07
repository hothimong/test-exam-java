package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(id = "username")
    WebElement username;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(xpath = "/html/body/div/div/div/div/fieldset/form/div[3]/button")
    WebElement btnlogin;

    public void setUsername(String userName){
        username.clear();
        if (!username.equals("null"))
            username.sendKeys(userName);
    }
    public void setPassword(String pass){
        password.clear();
        if (!password.equals("null"))
            password.sendKeys(pass);
    }
    public void clicksubmit(){
        btnlogin.click();
    }
}
