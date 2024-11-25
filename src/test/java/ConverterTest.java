import be.vdab.theorie.Converter;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;


public class ConverterTest {

    @Test
    void eenInchIs2Komma54Centimeters(){
        assertThat(new Converter().inchesNaarCentimeter(BigDecimal.ONE)).isEqualByComparingTo("2.54") ;
    }

    @Test
    void tweehonderInchesIs508Centimeters(){
        assertThat(new Converter().inchesNaarCentimeter(BigDecimal.valueOf(200))).isEqualByComparingTo("508");
    }
}
