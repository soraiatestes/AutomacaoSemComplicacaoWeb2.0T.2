package br.com.chronosacademy.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {
    @FindBy(css = "menuUser")

    public WebElement btnLogin;

    public WebElement btnFechar;

    public WebElement divFechaModal;

    public WebElement inpUserName;

    public WebElement inpPassword;

    public WebElement btnSign;

    public WebElement inpRemember;

    public WebElement linkCreateAccount;
}
