import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//@Listeners(NGListener.class)
public class HomePageScreen extends HelperUser {

    public HomePageScreen(WebDriver driver) {
        super(driver);

    }

    @FindBy(xpath = "//a[@href='/home']")
     private  WebElement elementHome;


@FindBy(xpath = "//a[@href='/login']")
private  WebElement login_link;






    public void ckickonHome() {

        elementHome.click();

    }

    public boolean is_element_Home_present() {
//pause(3000);
        return elementHome.isDisplayed();

    }


    public void go_to_login_page(){

        login_link.click();
    }











}

