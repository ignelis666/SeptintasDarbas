import org.junit.Test;
import org.junit.Assert;

public class ConverterTest {

    @Test
    public void arKlaseSukurta(){
        ConverterObj objektas = new ConverterObj();
    }

    @Test
    public  void arTuriKonstruktoriu()
    {
        Converter convert = new Converter(HexToDec);
    }
    @Test
    public void arYraKintamasis()
    {
        Converter convert = new Converter();
        int Hex =  Converter.Convert;
    }
    @Test
    public void arKlaseTuriObjekta()
    {
        Converter convert = new Converter();
        ConverterObj objektas = new ConverterObj();
    }
    @Test
    public void arKonvertuoja()
    {
        Converter convert = new Converter();
        Assert.assertEquals(45,convert.HexToDec());
    }

    Converter convert = new Converter();

    @Test
    public void auktuma()
    {
        Assert.assertEquals(14580,convert.aukstuma());
    }
    @Test
    public void greitis()
    {
        Assert.assertEquals(45,convert.greitis());
    }

    @Test
    public void ilguma()
    {
        Assert.assertEquals(457896,convert.ilguma());
    }

    @Test
    public void platuma()
    {
        Assert.assertEquals(689745,convert.platuma());
    }
    @Test
    public void IOelemntai()
    {
        Assert.assertEquals(12,convert.IOelementai());
    }


}
