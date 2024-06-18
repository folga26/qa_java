import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Assert;
import java.util.List;

public class FelineTest {

    @Test
    public void testEatMeat() throws Exception{
        Feline feline = new Feline();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
        System.out.println(feline.eatMeat());
    }
    @Test
    public void testGetFamily(){
        Feline feline = new Feline ();
        Assert.assertEquals("Кошачьи", feline.getFamily());
        System.out.println(feline.getFamily());
    }

    @Test
    public void testGetKitten(){
        Feline feline = new Feline();
        Assert.assertEquals(1, feline.getKittens());
        System.out.println(feline.getKittens());
    }

    @Test
    public void testGetKittensCount(){
        Feline feline = new Feline();
        Assert.assertEquals(1, feline.getKittens());
        System.out.println(feline.getKittens());
    }
}
