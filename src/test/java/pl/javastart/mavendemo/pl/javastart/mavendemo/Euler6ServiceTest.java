package pl.javastart.mavendemo.pl.javastart.mavendemo;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class Euler6ServiceTest {
    Euler6Service euler6Service = new Euler6Service();
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void subtratSquares() {
        int a = 3;
        int expectedResult = 22;

        int result = euler6Service.subtractionOfSquares(a);

        Assertions.assertEquals(result, expectedResult);
    }

    @org.junit.jupiter.api.Test
    void forValue5_shouldBe170() {
        int a = 5;
        int expectedResult = 170;

        int result = euler6Service.subtractionOfSquares(a);

        Assertions.assertEquals(result, expectedResult);
    }

    @org.junit.jupiter.api.Test
    void forValue10_shouldBe2640() {
        int a = 10;
        int expectedResult = 2640;

        int result = euler6Service.subtractionOfSquares(a);

        Assertions.assertEquals(result, expectedResult);
    }
}