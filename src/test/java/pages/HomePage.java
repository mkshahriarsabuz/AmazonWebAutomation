package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

    public String homepageUrl = "https://www.amazon.com";
    public By dismiss = By.xpath("//input[@class='a-button-input' and @data-action-type ='DISMISS']");
    public By dropdownBox = By.xpath("//select[@id='searchDropdownBox']");
    public By selectOptionSoftware = By.xpath("//option[text()='Software']");
    public By categoryDropdownButton = By.id("nav-search-dropdown-card");
    public By searchBox = By.xpath("//input[@id='twotabsearchtextbox']");
    public By searchButton = By.xpath("//input[@id='nav-search-submit-button']");

}

