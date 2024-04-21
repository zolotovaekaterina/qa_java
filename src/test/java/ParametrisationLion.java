import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

@RunWith(Parameterized.class)
public class ParametrisationLion {
    private final String sex;
    private final boolean hasMane;
    public ParametrisationLion(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Mock
    Feline feline;
    @Parameterized.Parameters
    public static Object[][] getTestData() {


        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"Ни самец ни самка", false}
        };
    }

    @Test
    public void lionAnotherSexTest()  {
        try{
            Lion lion = new Lion(sex, feline);
            lion.doesHaveMane();
            Assert.assertEquals(hasMane, lion.doesHaveMane());
        } catch (Exception e){
            Assert.assertEquals("Используйте допустимые значения пола животного - самей или самка",e.getMessage());
        }

    }
}
