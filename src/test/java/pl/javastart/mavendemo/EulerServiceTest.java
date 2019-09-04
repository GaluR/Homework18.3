package pl.javastart.mavendemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EulerServiceTest {
    EulerService eulerService = new EulerService();

    @Test
    void subtratSquares() {
        int a = 3;
        int expectedResult = 22;

        int result = eulerService.subtractionOfSquares(a);

        Assertions.assertEquals(result, expectedResult);
    }

    @Test
    void forValue5_shouldBe170() {
        int a = 5;
        int expectedResult = 170;

        int result = eulerService.subtractionOfSquares(a);

        Assertions.assertEquals(result, expectedResult);
    }

    @Test
    void forValue10_shouldBe2640() {
        int a = 10;
        int expectedResult = 2640;

        int result = eulerService.subtractionOfSquares(a);

        Assertions.assertEquals(result, expectedResult);
    }
}