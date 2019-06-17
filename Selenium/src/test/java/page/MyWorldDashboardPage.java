package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MyWorldDashboardPage {

    private final SelenideElement userNameInput = $("#j_username");
    private final SelenideElement passwordInput = $("#j_password");
    private final SelenideElement submitButton = $("#submit");
    private final SelenideElement dashboardPanel = $("#dashboard_panel_content_view_9512f44e2c0005");
    private final SelenideElement addNewPanelButton = $("#fab_button");
    private final SelenideElement fromAllProjectsPanel = $("#preview_panel_container_c0000068103e7");
    private final SelenideElement addPanelToDashboardButton = $("#panel_library_tick");
    private final SelenideElement panelOptions = $("#dashboard_panel_header_7 > div.header_content_container > div.nex_popup_menu_container");
    private final SelenideElement removeFromDashboard = $("#dashboard_panel_header_7 > div.header_content_container > div.nex_popup_menu_container > div > div:nth-child(1)");
    private final SelenideElement fromAllProjectsStatusPanel = $("#dashboard_panel_content_view_c0000068103ed");

    public void shouldLogin(String url, String userName, String password) {
        open("http://stgrel.i-nexus.com/stgrel/");
        userNameInput.setValue(userName);
        passwordInput.setValue(password);
        submitButton.click();
    }

    public static void shouldOpenMyWorldDashboardPage() {
        open("https://stgrel.i-nexus.com/stgrel/View.nex?link=8e11d0fdd9000f&page=8e11d0fdd90023");
    }

    public void shouldHaveDashboardPanel() {
        dashboardPanel.shouldBe(visible);
    }

    /**
     * This method would add a new panel to the dashboard
     */
    public void shouldBeAbleToAddPanel() {
        addNewPanelButton.shouldBe(visible).click();
        fromAllProjectsPanel.shouldBe(visible).click();
        addPanelToDashboardButton.shouldBe(visible).click();
    }

    /**
     * This method would remove a panel from the dashboard
     */

    public void shouldBeAbleToRemovePanel() {
        fromAllProjectsStatusPanel.shouldBe(visible);
        panelOptions.shouldBe(visible).click();
        removeFromDashboard.shouldBe(visible).click();
    }
}
