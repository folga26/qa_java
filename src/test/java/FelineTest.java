import com.example.Feline;
import org.junit.Test;
import org.junit.Assert;
import java.util.List;

public class FelineTest {

    @Test
    public void testEatMeat() throws Exception{
        Feline feline = new Feline();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }
    @Test
    public void testGetFamily(){
        Feline feline = new Feline ();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKitten(){
        Feline feline = new Feline();
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittensCount(){
        Feline feline = new Feline();
        Assert.assertEquals(1, feline.getKittens());
    }
}
