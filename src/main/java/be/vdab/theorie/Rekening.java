package be.vdab.theorie;

import java.math.BigDecimal;

public class Rekening {
    private BigDecimal saldo = BigDecimal.ZERO;

    void stort(BigDecimal bedrag){
        if(bedrag.compareTo(BigDecimal.ZERO)<=0){
            throw new IllegalArgumentException("Bedrag moet positief zijn");
        }
        saldo = saldo.add(bedrag);
    }

    BigDecimal getSaldo(){
        return saldo;
    }


}

/*Je kan ook testen of je method een eigen gedefinieerde exception werpt.
Fictief voorbeeld: de method haalAf moet een OnvoldoendeSaldoException werpen:
assertThatExceptionOfType(OnvoldoendeSaldoException.class)
.isThrownBy(()->rekening.haalAf(BigDecimal.TEN));
*/
