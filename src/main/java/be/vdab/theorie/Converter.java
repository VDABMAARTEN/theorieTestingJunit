package be.vdab.theorie;

import java.math.BigDecimal;

public class Converter {
    private static final BigDecimal AANTAL_CENTIMETER_IN_EEN_INCH = BigDecimal.valueOf(2.34);

    public BigDecimal inchesNaarCentimeter(BigDecimal inches){
        return inches.multiply(AANTAL_CENTIMETER_IN_EEN_INCH);
    }

}
