import com.example.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)

public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void testGetKittens() throws Exception{
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void testGetFoodAnimal() throws Exception{
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test
    public void testException(){
        Exception actualException = assertThrows(Exception.class, () -> new Lion("неизвестный тип", feline));
        Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", actualException.getMessage());
    }
}
