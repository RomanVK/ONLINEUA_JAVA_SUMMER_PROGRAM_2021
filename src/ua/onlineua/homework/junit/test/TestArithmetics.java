package ua.onlineua.homework.junit.test;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import ua.onlineua.homework.junit.calculation.Arithmetics;

import java.util.concurrent.TimeUnit;

public class TestArithmetics {
    private static Arithmetics a;
    double result;

    @Rule
    public final ExpectedException exp = ExpectedException.none();

    @Rule
    public Timeout timeout = new Timeout(1000L, TimeUnit.MILLISECONDS);

    @BeforeClass
    public static void beforeAllTest(){
        a = new Arithmetics();
    }

    @AfterClass
    public static void afterAllTest(){
        Arithmetics a = null;
    }

    @Test
    public void testAdd(){
        result = a.add(3.0,7.0);
        Assert.assertEquals(10.0, result, Math.ulp(result));
    }

    @Ignore("testDeduct was ignored")
    @Test
    public void testDeduct(){
        result = a.deduct(3.0,7.0);
        Assert.assertEquals(-4.0, result, Math.ulp(result));
    }

    @Test
    public void testMult(){
        result = a.mult(3.0,7.0);
        Assert.assertEquals(21.0, result, Math.ulp(result));
    }

    @Test
    public void testDiv(){
        result = a.div(10.0,5.0);
        Assert.assertEquals(2.0, result, Math.ulp(result));
    }

    @Test//(expected = ArithmeticException.class)
    public void testDivException(){
        exp.expect(ArithmeticException.class);
        a.div(-10.0, 0.0);
    }

    @Test//(timeout = 1000)
    public void testDivTimeout(){
        a.div(10.0, 10.0);
        //while(true);
    }

}
