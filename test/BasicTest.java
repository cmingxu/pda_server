import org.junit.*;
import java.util.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest {

    @Test
    public void aVeryImportantThingToTest() {
//        User u = new User("bob@gmail.com", "secret").save();

        // Retrieve the user with e-mail address bob@gmail.com
//        User bob = User.find("用户组", "系统管理员").first();
//
//        // Test
//        //assertNotNull(bob);
//        assertEquals("系统管理员", bob.用户组);
//        assertEquals("123", bob.密码);

        System.out.println("@@@@@@@@@@@ " + Louge.count());
        List<Louge> louges = Louge.findAll();
        assertEquals(Louge.count(), louges.size());
    }

    @Test
    public void TestLougeTest(){
    }

}
