package Steps.PageSteps;

import Helpers.Helpers;
import Helpers.WaitHelpers.WaitHelper;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class SelectionsSteps {

    private final By firstSelection     = By.xpath("//*[@id=\"body-inner\"]/div[1]/span/span[1]/span");
    private final By secondSelection    = By.xpath("//*[@id=\"body-inner\"]/div[2]/p/span/span[1]");

    @When("Проверка наличия слов {string}")
    public void checkingForWords(String words) {
        new Helpers().isElementPresent(By.xpath("//*[contains(text(),'" + words + "')]"));
    }

    @When("Выбор из первого выпадающего списка элемента {int} -> {string}")
    public void selectFromFirstDropDownList(int count, String option) {
        if(count == 1) {
            new WaitHelper().waitElementToBeClickable(firstSelection);
            new WaitHelper().waitElementToBeClickable(By.xpath("//li[contains(text(),'" + option + "')]"));
        } else if(count == 2) {
            new WaitHelper().waitElementToBeClickable(secondSelection);
            new WaitHelper().waitElementToBeClickable(By.xpath("//li[contains(text(),'" + option + "')]"));
        }
    }

    @When("Клик по ссылке -> {string}")
    public void linkClick(String link) {
        new WaitHelper().waitElementToBeClickable(By.xpath("//a[contains(text(),'" + link + "')]"));
    }

}
