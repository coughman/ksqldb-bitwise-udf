package io.confluent.ksqldb.udf.math;

import io.confluent.ksql.function.FunctionCategory;
import io.confluent.ksql.function.udf.Udf;
import io.confluent.ksql.function.udf.UdfDescription;


@UdfDescription(name="bitwise_and", version = "1.0", description = "bitwise AND", category = FunctionCategory.MATHEMATICAL)
public class BitwiseAnd {

    @Udf(description = "int version")
    public int and(int op1, int mask) {
        return op1 & mask;
    }

    @Udf(description = "long/bigint version")
    public long and(long op1, long mask) {
        return op1 & mask;
    }
}
