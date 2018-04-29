import ch2.PrimePrint;
import org.junit.Assert;
import org.junit.Test;

public class TestPrime {


    @Test
    public void testPrime(){
        PrimePrint pp = new PrimePrint();
        Assert.assertEquals(true,pp.isPrime(2));
    }
}
