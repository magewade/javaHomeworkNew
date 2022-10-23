package org.andersen.lab.lesson12;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;


public class TriangleTest {
    private static final Logger logger= LoggerFactory.getLogger(TriangleTest.class);

    @BeforeAll
    static void beforeAll(){
        logger.info("Triangle square tests");
    }

    @BeforeEach
    void setUp(){
        logger.info("Test starts");
    }


    @Test
    @DisplayName("First positive test")
    void positiveSquareCalcTest1() throws Exception {
        double result = TriangleSquareCalculation.calculateTriangleSquare(15, 15, 15);
        Assertions.assertEquals(97.42785792574935, result);
    }

    @Test
    @DisplayName("Second positive test")
    void positiveSquareCalcTest2() throws Exception {
        double result = TriangleSquareCalculation.calculateTriangleSquare(3, 4, 5);
        Assertions.assertEquals(6, result);
    }

    @Test
    @DisplayName("Third positive test")
    void positiveSquareCalcTest3() throws Exception {
        double result = TriangleSquareCalculation.calculateTriangleSquare(10, 10, 5);
        Assertions.assertEquals(24.206145913796355, result);
    }

    @Test
    @DisplayName("First negative test")
    void negativeSquareCalcTest1() {
        assertThatExceptionOfType(Exception.class).isThrownBy(() -> TriangleSquareCalculation.calculateTriangleSquare(15, -15, 15));
    }

    @Test
    @DisplayName("Second negative test")
    void negativeSquareCalcTest2() {
        assertThatExceptionOfType(Exception.class).isThrownBy(() -> TriangleSquareCalculation.calculateTriangleSquare(0, 3, 4));
    }

    @Test
    @DisplayName("Third negative test")
    void negativeSquareCalcTest3() {
        assertThatExceptionOfType(Exception.class).isThrownBy(() -> TriangleSquareCalculation.calculateTriangleSquare(1, 2, 3));
    }

    @AfterEach
    void tearDown(){
        logger.info("Test ends");
    }

    @AfterAll
    static void AfterAll(){
        logger.info("Finish");
    }
}
