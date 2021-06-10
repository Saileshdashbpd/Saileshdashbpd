package test;

import com.SBPN.api.postman.Helper;
import org.testng.annotations.Test;

public class DemoTest {

    @Test
    public void testName() {
        Helper helper = new Helper();
        helper.test();
    }
}
