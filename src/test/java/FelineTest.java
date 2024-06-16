import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Spy;
import org.junit.Assert;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)

public class FelineTest {
    @Spy
    private Feline feline;

    @Test
    public void testEatMeat() throws Exception{
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }
    @Test
    public void testGetFamily(){
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKitten(){
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittensCount(){
        feline.getKittens(1);
        Assert.assertEquals(1, feline.getKittens());
    }
}
