import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.*;

import java.io.IOException;
import java.lang.reflect.Method;

@Slf4j
@Listeners(NGListener.class)
 class TestBase   {
    UPSTART app=new UPSTART();
    @BeforeMethod(alwaysRun = true)
    public void startTest(Method method ){
        log.info("Started test ---> " + method.getName());

    }
    @AfterMethod(alwaysRun = true)
    public void stopTest(Method method ){
        log.info("Finished test ---> " + method.getName());
        log.info("=====================================================================================================" );

    }



    @BeforeSuite()
    public void startapp() throws IOException {

        app.startapp();


    }



@AfterSuite()
    public void close_browser(){

     ///   app.close_browser();


}







    }




