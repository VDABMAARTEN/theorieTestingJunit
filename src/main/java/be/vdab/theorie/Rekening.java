package be.vdab.theorie;

import java.math.BigDecimal;

public class Rekening {
    private BigDecimal saldo = BigDecimal.ZERO;

    void stort(BigDecimal bedrag){
        saldo = saldo.add(bedrag);
    }

    BigDecimal getSaldo(){
        return saldo;
    }


}
