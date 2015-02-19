package testTeam;

import org.testng.Assert;
import org.testng.annotations.Test;

import devTeam.Member;

public class MemberTest {
    @Test
    public void testFullName() {

            Member m= new Member();

            String mname = m.FullName("Linh", "Pham");

            Assert.assertEquals("Linh Pham",  mname);
    System.out.println();
    System.out.println("ProjectQ tember name: Linh Pham");
    }

}
