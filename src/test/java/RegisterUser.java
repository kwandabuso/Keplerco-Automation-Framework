import Pojo.Register;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class RegisterUser extends BaseTest {

    @Test
    public void register() {

        int random_int = (int)Math.floor(Math.random() * (999 - 1 + 1) + 1);

        String email = "test@test.com";
        String password = "Password123!"+ random_int;
        land.openUrl();
        Register register = land.clickSignup();
        register.enterEmail(email);
        register.enterPassword(password);
        register.clickSignup();

        String verifysignupMessage = register.getSuccessMessage();

        assertTrue(verifysignupMessage.contains(email));
    }
}
