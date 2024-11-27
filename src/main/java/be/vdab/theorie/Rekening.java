package be.vdab.theorie;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Rekening {
    private BigDecimal saldo = BigDecimal.ZERO;
    private final List<BigDecimal> stortingen = new ArrayList<>();

    void stort(BigDecimal bedrag){
        if(bedrag.compareTo(BigDecimal.ZERO)<=0){
            throw new IllegalArgumentException("Bedrag moet positief zijn");
        }
        saldo = saldo.add(bedrag);
    }

    BigDecimal getSaldo(){
        return stortingen.stream().reduce(BigDecimal.ZERO,
                (vorigSaldo, storting) -> vorigSaldo.add(storting));
    }

    List<BigDecimal> getStortingen() {
        return stortingen;

    }
    List<BigDecimal> getStortingenGesorteerd() {
        return stortingen.stream().sorted().toList();

    }


}

/*Je kan ook testen of je method een eigen gedefinieerde exception werpt.
Fictief voorbeeld: de method haalAf moet een OnvoldoendeSaldoException werpen:
assertThatExceptionOfType(OnvoldoendeSaldoException.class)
.isThrownBy(()->rekening.haalAf(BigDecimal.TEN));
*/
