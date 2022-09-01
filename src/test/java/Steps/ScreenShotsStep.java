package Steps;

import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static Steps.BeforeStep.driver;

public class ScreenShotsStep {

    @When("Снимок экрана")
    public static void takeScreenshot() throws IOException {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile,
                new File("target/screenshots/screenshot" + java.util.UUID.randomUUID() + ".png"));
    }
}
