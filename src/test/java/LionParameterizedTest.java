import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.assertEquals;

import java.util.List;

@RunWith(Parameterized.class)

public class LionParameterizedTest {
    private String gender;
    private boolean result;



    public LionParameterizedTest(String gender, boolean result) {
        this.gender = gender;
        this.result = result;

    }

    @Parameterized.Parameters
    public static Object[] getAnimalGender() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getKittens () throws Exception {
        Lion lion = new Lion(gender, new Feline());
        assertEquals(result, lion.doesHaveMane());
    }



}
