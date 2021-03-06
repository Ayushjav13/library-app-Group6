package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibrarianPage {
    public LibrarianPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "inputEmail")
    public WebElement usernameBox;

    @FindBy(id = "inputPassword")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signIn;

    @FindBy (linkText = "Books")
    public WebElement booksLinkPage;

    @FindBy (linkText = "Dashboard")
    public WebElement DashboardLinkPage;

    @FindBy (id = "navbarDropdown")
    public WebElement userID;

    @FindBy(linkText = "Log Out")
    public WebElement logOut;

}
