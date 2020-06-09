package calculator;

        import org.testng.Assert;
        import org.testng.annotations.BeforeClass;
        import org.testng.annotations.Test;

public class TestCalculator {
//    Взять программу Calculator, которую Вы писали в одном из предыдущих дз,
//    добавить в нее не менее 5 математических действий и написать 5 авто тестов
//    на каждое математическое действие. Calculator должен быть написан в модуле main maven-проекта,
//    тесты пишем ВСЕГДА в модуле test maven-проекта.
//
//    Каждый авто тест должен быть описан через аннотацию @Test, должен иметь конфигурационные методы.
//    Тесты должны запускать через testng.xml командой mvn clean test.

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