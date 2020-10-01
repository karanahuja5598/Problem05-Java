package cd.get.ready.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class EuclidsAlgorithmTest {

    @Test
    public void testOne(){
        EuclidsAlgorithm ea = new EuclidsAlgorithm();
        int expected = ea.gcd(78, 36);
        int actual = 6;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTwo(){
        EuclidsAlgorithm ea = new EuclidsAlgorithm();
        int expected = ea.gcd(225, 40);
        int actual = 5;
        Assert.assertEquals(expected, actual);
    }

}