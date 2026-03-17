import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(NGListener.class)

public class TestHomePage extends TestBase {

    @Test
    public void clickOnbtnHome() {
        new HomePageScreen(app.wd).ckickonHome();


    }



    @Test
    public void is_Home_element_present() {


        Assert.assertTrue(new HomePageScreen(app.wd).is_element_Home_present());

    }









}




