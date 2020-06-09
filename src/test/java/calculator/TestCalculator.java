package calculator;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCalculator {

    public int a;
    public int b;
    private int actualResult;

    @BeforeClass
    public void setUpData() {
        a = 10;
        b = 2;
    }

    @Test
    public void addition() {
        int expectedResult = 12;
        actualResult = a + b;
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println(actualResult);
        if (expectedResult == actualResult) {
            System.out.println("Test passed");
        } else {
            System.out.println("Something has gone wrong");
        }
    }

    @Test
    public void multiplication() {
        int expectedResult = 20;
        actualResult = a * b;
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println(actualResult);
        if (expectedResult == actualResult) {
            System.out.println("Test passed");
        } else {
            System.out.println("Something has gone wrong");
        }
    }

    @Test
    public void subtraction() {
        int expectedResult = 8;
        actualResult = a - b;
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println(actualResult);
        if (expectedResult == actualResult) {
            System.out.println("Test passed");
        } else {
            System.out.println("Something has gone wrong");
        }
    }

    @Test
    public void division() {
        int expectedResult = 5;
        actualResult = a / b;
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println(actualResult);
        if (expectedResult == actualResult) {
            System.out.println("Test passed");
        } else {
            System.out.println("Something has gone wrong");
        }
    }

    @Test
    public void square() {
        int expectedResult = 100;
        actualResult = a * a;
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println(actualResult);
        if (expectedResult == actualResult) {
            System.out.println("Test passed");
        } else {
            System.out.println("Something has gone wrong");
        }
    }
}