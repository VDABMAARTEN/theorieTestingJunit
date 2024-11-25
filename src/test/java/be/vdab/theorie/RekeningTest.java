package be.vdab.theorie;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RekeningTest {
    @Test
    void hetSaldoVanEenNieuweRekeningIs0Euro() {
        var rekening = new Rekening();
        assertThat(rekening.getSaldo()).isZero();
    }

    @Test
    void nadatJe10EuroStortIsHetSaldo10Euro() {
        var rekening = new Rekening();
        rekening.stort(BigDecimal.valueOf(10));
        assertThat(rekening.getSaldo()).isEqualByComparingTo("10");
    }

    @Test
    void nadatJe10EuroEn1EuroStortIsHetSaldo11Euro() {
        var rekening = new Rekening();
        rekening.stort(BigDecimal.valueOf(10));
        rekening.stort(BigDecimal.ONE);
        assertThat(rekening.getSaldo()).isEqualByComparingTo("11");
    }
}