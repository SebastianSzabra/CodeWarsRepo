import com.company.SmileFaces;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.*;

public class SmileFacesTest {

    @Test
    public void test1() {
        List<String> a = new ArrayList<String>();
        a.add(":)"); a.add(":D"); a.add(":-}"); a.add(":-()");
        assertEquals(2, SmileFaces.countSmileys(a));
    }

    @Test
    public void test2() {
        List<String> a = new ArrayList<String>();
        a.add(":)"); a.add("XD"); a.add(":0}"); a.add("x:-"); a.add("):-"); a.add("D:");
        assertEquals(1, SmileFaces.countSmileys(a));
    }

    @Test
    public void test4() {
        List<String> a =  new ArrayList<String>();
        a.add(":)"); a.add(":D"); a.add("X-}"); a.add("xo)"); a.add(":X"); a.add(":-3"); a.add(":3");
        assertEquals(2, SmileFaces.countSmileys(a));
    }

    @Test
    public void test5() {
        List<String> a =  new ArrayList<String>();
        a.add(":)"); a.add(":)"); a.add("x-]"); a.add(":ox"); a.add(";-("); a.add(";-)"); a.add(";~("); a.add(":~D");
        assertEquals(4, SmileFaces.countSmileys(a));
    }@Test
    public void test6() {
        List<String> a =  new ArrayList<String>();
        a.add("p2)"); a.add("[4D)"); a.add(":)"); a.add(":8)p"); a.add(";X"); a.add("25--)"); a.add(";D"); a.add("xo)");a.add("~;op");a.add(";D");a.add("o~pD");a.add(";x)");a.add(":8x");a.add("')");a.add(";~-x");a.add(";~~x");a.add(":D)");a.add("4~)");a.add("4-)");a.add(":-)");a.add("8;Dx");a.add("4D");a.add(";~D");a.add(":P");a.add("4X");a.add("84-Pp");a.add(":~P");a.add("4-P");a.add("48-x");a.add("5D");a.add(";)");a.add(";-)");a.add("')");a.add(";)");
        assertEquals(8, SmileFaces.countSmileys(a));
    }
}