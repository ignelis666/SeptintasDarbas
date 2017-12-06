import org.junit.Test;
import org.junit.Assert;



public class SkaiciavimaiTest {

    Skaiciavimai skaiciavimai = new Skaiciavimai();
    @Test
    public void plotas() throws Exception {
        Assert.assertEquals(25,skaiciavimai.plotas(5));
    }

    @Test
    public void perimetras() throws Exception {
        Assert.assertEquals(27,skaiciavimai.perimetras(7,12,8));
    }

    @Test
    public void daugyba() throws Exception {
        Assert.assertEquals(40,skaiciavimai.daugyba(4,10));
    }

    @Test
    public void sudetis() throws Exception {
        Assert.assertEquals(840,skaiciavimai.sudetis(120,720));
    }

    @Test
    public void dalyba() throws Exception {
        Assert.assertEquals(7,skaiciavimai.dalyba(21,3));
    }

    @Test
    public void sunkesnisVeiksmas() throws Exception {
        Assert.assertEquals(4.0,skaiciavimai.sunkesnisVeiksmas(4,2.5,5,0.5));
    }

    @Test
    public void factorialas() throws Exception {
        Assert.assertEquals(5040,skaiciavimai.factorialas(7));
    }

    @Test
    public void zmogus() throws Exception {
        Assert.assertEquals("Orestas Nuodegulis",skaiciavimai.zmogus("Orestas","Nuodegulis"));
    }



}