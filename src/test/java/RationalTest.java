import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
//    @Test
//    public void testAdd() {
//        Rational x = new Rational();
//        x.numerator = 1;
//        x.denominator = 2;
//        Rational y = new Rational();
//        y.numerator = 1;
//        y.denominator = 4;
//        x.add(y);
//        Assert.assertEquals(3, x.numerator);
//    }
    @Test
    public void testAdd() throws Rational.Illegal {
        Rational r = new Rational(1,2);
//        r.numerator = 1;
//        r.denominator = 2;
        Rational s = new Rational(1,4);
//        s.numerator = 2;
//        s.denominator = 3;
        r.add(s);
        Assert.assertEquals(3, r.numerator);
        Assert.assertEquals(4, r.denominator);
    }
    @Test
    public void testsubtract() throws Rational.Illegal {
        Rational r = new Rational(1,4);
        Rational s = new Rational(1,8);
        r.subtract(s);
        Assert.assertEquals(1, r.numerator);
        Assert.assertEquals(8, r.denominator);
    }
    @Test
    public void testmultiply() throws Rational.Illegal {
        Rational r = new Rational(1,9);
        Rational s = new Rational(1,4);
        r.multiply(s);
        Assert.assertEquals(1, r.numerator);
        Assert.assertEquals(36, r.denominator);
    }
    @Test
    public void testdivide() throws Rational.Illegal {
        Rational r = new Rational(1,7);
        Rational s = new Rational(1,4);
        r.divide(s);
        Assert.assertEquals(4, r.numerator);
        Assert.assertEquals(7, r.denominator);
    }
    @Test
    public void testequals() throws Rational.Illegal {
        Rational r = new Rational(1,16);
        Rational s = new Rational(1,16);
        Assert.assertTrue(r.equals(s));
    }
    @Test
    public void testcompareTo() throws Rational.Illegal {
        Rational r = new Rational(4,2);
        Rational s = new Rational(1,32);
        Assert.assertEquals(1,r.compareTo(s));
    }
    @Test
    public void testtoStringo() throws Rational.Illegal {
        Rational r = new Rational(1,9);
        Assert.assertEquals("1/9",r.toString());
    }
}

