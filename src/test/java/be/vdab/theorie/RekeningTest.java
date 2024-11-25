package be.vdab.theorie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RekeningTest {
    private Rekening rekening;

    @BeforeEach
    void beforeEach(){
        rekening = new Rekening();
    }

    @Test
    void hetSaldoVanEenNieuweRekeningIs0Euro() {
        assertThat(rekening.getSaldo()).isZero();
    }

    @Test
    void nadatJe10EuroStortIsHetSaldo10Euro() {
        rekening.stort(BigDecimal.valueOf(10));
        assertThat(rekening.getSaldo()).isEqualByComparingTo("10");
    }

    @Test
    void nadatJe10EuroEn1EuroStortIsHetSaldo11Euro() {
        rekening.stort(BigDecimal.valueOf(10));
        rekening.stort(BigDecimal.ONE);
        assertThat(rekening.getSaldo()).isEqualByComparingTo("11");
    }
}