package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchResultPage;
import utilities.DriverSetup;

public class TestSearchFeature extends DriverSetup {

    HomePage homePage = new HomePage();
    SearchResultPage searchResultPage = new SearchResultPage();

    @Test
    public void navigateToAmazonHomePage() throws InterruptedException {
        homePage.loadAWebPage(homePage.homepageUrl);
        Thread.sleep(4000);
        homePage.clickOnElement(homePage.dismiss);
        Thread.sleep(2000);
    }

    @Test
    public void testSearchWithValidInput() throws InterruptedException {

        //Select the Element Software by scrolling the dropdown
        homePage.clickOnElement(homePage.categoryDropdownButton);
        Thread.sleep(1000);
        homePage.scrollToElement(homePage.selectOptionSoftware);
        Thread.sleep(1000);
        homePage.selectElementValue(homePage.dropdownBox, "Software");
        Thread.sleep(1000);

        //Insert the text for search (like-Games) and click the search button
        homePage.writeOnElement(homePage.searchBox,"Games");
        Thread.sleep(1000);
        homePage.clickOnElement(homePage.searchButton);
        Thread.sleep(1000);

        //Verify the search results shows for item Games
        Assert.assertEquals(searchResultPage.getElementText(searchResultPage.searchProductName), "\"Games\"");
        Thread.sleep(1000);
    }

}
