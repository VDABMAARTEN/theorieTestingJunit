import be.vdab.theorie.Jaar;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat; // DEZE LIJN ZORGT DAT WE LATER GEEN ASSERTIONS.ASSERTTHAT moeten typen


class JaarTest {
    @Test
    void eenJaarDeelbaarDoor400IsEenSchrikkeljaar() {
        var jaar = new Jaar(2000);
        assertThat(jaar.isSchrikkeljaar()).isTrue();
    }

    @Test
    void eenJaarDeelbaarDoor100IsGeenSchrikkeljaar(){
        var jaar = new Jaar(1900);
        assertThat(jaar.isSchrikkeljaar()).isFalse();
    }

    @Test
    void eenJaarDeelbaarDoor4IsEenSchrikkeljaar(){
        var jaar = new Jaar(2012);
        assertThat(jaar.isSchrikkeljaar()).isTrue();
    }

    @Test
    void eenJaarNietDeelbaarDoor4IsGeenSchrikkeljaar(){
        var jaar = new Jaar(2015);
        assertThat(jaar.isSchrikkeljaar()).isFalse();
    }

//    tostring test
@Test
    void toStringGeeftHetJaarAlsTekst(){
        assertThat(new Jaar(2015).toString()).isEqualTo("2015");
    }

//
    @Test
    void jarenMetHetzelfdeJaartalZijnGelijk(){
        assertThat(new Jaar(2015)).isEqualTo(new Jaar (2015));
    }

    @Test
    void jarenMetEenVerschillendJaartalZijnVerschillend(){
        assertThat(new Jaar (2015)).isNotEqualTo(new Jaar(2016));
    }

    @Test
    void deHashCodeVanGelijkeJarenIsGelijk(){
        assertThat(new Jaar(2015)).hasSameHashCodeAs()
    }
}
