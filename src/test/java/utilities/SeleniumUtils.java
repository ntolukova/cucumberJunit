package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class SeleniumUtils {
    public static List<String> getAllSelectedOptions (WebElement element){
        Select select = new Select(element);
        List<String> options = new ArrayList<>();
        for(WebElement eachOption : select.getOptions()){
            options.add(eachOption.getText());
        }
        return options;

    }
}
