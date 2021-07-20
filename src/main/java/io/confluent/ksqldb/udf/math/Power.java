package io.confluent.ksqldb.udf.math;

import io.confluent.ksql.function.FunctionCategory;
import io.confluent.ksql.function.udf.Udf;
import io.confluent.ksql.function.udf.UdfDescription;

@UdfDescription(name="power", version = "1.0", description = "power function", category = FunctionCategory.MATHEMATICAL)
public class Power {

    @Udf(description = "int version")
    public double pow(int x, int y) {
        return Math.pow(x,y);
    }

    @Udf(description = "double version")
    public double pow(double x, double y) {
        return Math.pow(x,y);
    }
}
