import org.testng.annotations.Test;
import java.util.Arrays;


public class RoundingNumbersTest {

    @Test
    public void testRounding() {

        String[] numbersStrint = new String[] {"2.7","5.2","3","2.4","854","95.4"};
        int[] numbersInt = new int[]{3,5,3,2,854,94};

        int[] testRoudingNumbers = new int[6];

        RoundingNumbers roundingNumbers = new RoundingNumbers();
        roundingNumbers.rounding(numbersStrint, testRoudingNumbers);

        Arrays.equals(testRoudingNumbers, numbersInt);


    }
}