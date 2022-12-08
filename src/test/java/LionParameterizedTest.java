import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

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
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveManeTest () throws Exception {
        Lion lion = new Lion(gender, new Feline());
        assertEquals(result, lion.doesHaveMane());
    }
}
