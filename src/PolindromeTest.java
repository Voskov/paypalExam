import junit.framework.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by Einstine on 13/12/13.
 */
public class PolindromeTest {

    @Test
    public void testOne() {
        Assert.assertEquals("Should pass", 1, Polindrome.solution("a"));
    }
    @Test
    public void testTwo() {
        Assert.assertEquals("Should pass", 1, Polindrome.solution("aa"));
    }
    @Test
    public void testThree() {
        Assert.assertEquals("Should pass", 1, Polindrome.solution("aaa"));
    }
    @Test
    public void testPolindrome() {
        Assert.assertEquals("Should pass", 1, Polindrome.solution("aba"));
    }
    @Test
    public void testAnagram() {
        Assert.assertEquals("Should pass", 1, Polindrome.solution("baa"));
    }
    @Test
    public void testAnagram2() {
        Assert.assertEquals("Should pass", 1, Polindrome.solution("aab"));
    }
    @Test
    public void testWord() {
        Assert.assertEquals("Should pass", 1, Polindrome.solution("kayak"));
    }
    @Test
    public void testKayakAnagra() {
        Assert.assertEquals("Should pass", 1, Polindrome.solution("aaykk"));
    }

    @Ignore
    public void testABC() {
        Assert.assertEquals("Should fail", 0, Polindrome.solution("aba"));
    }
}
