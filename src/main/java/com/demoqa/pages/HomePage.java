package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css=".top-card:nth-child(3)")
    WebElement getAlertsFrameWindows;

    public SidePanel getAlertsFrameWindows() {
        clickWithJS(getAlertsFrameWindows,0,300);
        return new SidePanel(driver);
    }

    @FindBy(css=".top-card:nth-child(4)")
    WebElement widgets;
    public SidePanel getWidgets() {
        clickWithJS(widgets,0,300);
        return new SidePanel(driver);
    }
}
