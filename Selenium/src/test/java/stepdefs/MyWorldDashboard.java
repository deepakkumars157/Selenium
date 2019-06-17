package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import page.MyWorldDashboardPage;

public class MyWorldDashboard {

    @Given("^I am logged into \"([^\"]*)\" with \"([^\"]*)\" and Password as \"([^\"]*)\"$")
    public void iAmLoggedIntoWithAndPasswordAs(String url, String userName, String password) {
        MyWorldDashboardPage myWorldDashboardPage = new MyWorldDashboardPage();
        myWorldDashboardPage.shouldLogin(url, userName, password);
    }

    @And("^I navigate to My World Dashboard$")
    public void iNavigateToMyWorldDashboard() {
        MyWorldDashboardPage.shouldOpenMyWorldDashboardPage();
    }

    @Then("^I should be presented with my Dashboard$")
    public void iShouldBePresentedWithMyDashboard() {
        MyWorldDashboardPage myWorldDashboardPage = new MyWorldDashboardPage();
        myWorldDashboardPage.shouldHaveDashboardPanel();
    }

    @And("^I add a new panel$")
    public void iAddANewPanel() {
        MyWorldDashboardPage myWorldDashboardPage = new MyWorldDashboardPage();
        myWorldDashboardPage.shouldBeAbleToAddPanel();
    }

    @And("^I can remove a panel$")
    public void iCanRemoveAPanel() {
        MyWorldDashboardPage myWorldDashboardPage = new MyWorldDashboardPage();
        myWorldDashboardPage.shouldBeAbleToRemovePanel();

    }
}
