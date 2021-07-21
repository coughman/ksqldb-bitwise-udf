package io.confluent.ksqldb.udf.math;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PowerTest {

    Power power = new Power();

    @ParameterizedTest
    @ValueSource(ints = {0,2,4,6,8,12,16,32})
    void powerOf2(int p) {
        assertEquals((int)Math.round(Math.pow(2,p)), power.pow(2,p));
    }

    @ParameterizedTest
    @ValueSource(doubles = {0,2,4,6,8,16,32})
    void powerOf2(double p) {
        assertEquals(Math.pow(2,p), power.pow(2,p));
    }
}