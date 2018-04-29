import ch2.Factor;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestFactor {

    @Test
    public void testFactpr(){
        Assert.assertEquals(Arrays.asList(2,3,3,5,5,7,7,7), Factor.factor(2*3*3*5*5*7*7*7));
    }
}
