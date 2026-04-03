import object_model.User_model;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testLoginNegative extends TestBase {
   @Test (dataProvider = "data_login",dataProviderClass = Data_Provider.class)
   public void testlogin(String type, User_model user,String expected_message){
HomePageScreen home=new HomePageScreen(app.wd);
if(!type.startsWith("negative"))
return;

home.go_to_login_page().login(user.getEmail(),user.getPassword());
Assert.assertTrue(new LoginRegistrationPage(app.wd).is_allert_present(expected_message));







   }











}
