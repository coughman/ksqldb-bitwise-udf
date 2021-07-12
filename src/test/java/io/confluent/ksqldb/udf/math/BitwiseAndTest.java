package io.confluent.ksqldb.udf.math;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BitwiseAndTest {
    BitwiseAnd bitwiseAnd = new BitwiseAnd();

    @ParameterizedTest
    @ValueSource(ints = {0,4})
    void test010Zero(int argument) {
        assertEquals(0, bitwiseAnd.and(argument,2));
    }

    @ParameterizedTest
    @ValueSource(ints = {2,6})
    void test010Two(int argument) {
        assertEquals(2, bitwiseAnd.and(argument,2));
    }

    @Test
    void testInt2Power()
    {
        int bits = 8;
        while (bits > 0) {
            int n = 2 << bits--;
            assertEquals(0, bitwiseAnd.and(0, n));
            assertEquals(n, bitwiseAnd.and(n, n));
        }
    }

    @ParameterizedTest
    @ValueSource(longs = {0,4})
    void testLong010Zero(long argument) {
        assertEquals(0L, bitwiseAnd.and(argument,2L));
    }

    @ParameterizedTest
    @ValueSource(longs = {2,6})
    void testLong010Two(long argument) {
        assertEquals(2L, bitwiseAnd.and(argument,2L));
    }
}
