import org.junit.Assert;
import org.junit.Test;

import static src.CalculTaxes.*;
import static org.junit.jupiter.api.Assertions.assertThrows;


class CalculTaxesTest {
    @Test
    public void calculerTaxeDeVentesTpsTvq(){
        Assert.assertEquals(14141, calculerTaxeDeVentes(12300,true, true));
    }

    @Test
    public void calculerTaxeErronne(){
        Assert.assertNotEquals(12300, calculerTaxeDeVentes(12300,true, true));
    }

    @Test
    public void CalculerTaxedeventreNbzero(){
        assertThrows(IllegalArgumentException.class, ()-> calculerTaxeDeVentes(0,true,false));
    }

}