import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Lion lion;

    @Test
    public void throwExceptionTest() {
        Exception exception = assertThrows(Exception.class, () -> {
           Lion lion = new Lion("Sамка", new Feline());
       });
        assertEquals("Используйте допустимые значения пола животного - самей или самка", exception.getMessage());
    }

    @Test
    public void getKittens()  {
        when(lion.getKittens()).thenReturn(123);
        assertEquals(123, lion.getKittens());

    }
}






