import org.testng.annotations.Test;
import java.util.Arrays;


public class RoundingNumbersTest {

    @Test
    public void testRounding() {

        String[] numbersStrint = new String[] {"2","2.0","2.1","2.4","2.5","2.9","1.9","1.9999","2.0001"};
        int[] numbersInt = new int[]{2,2,2,2,3,3,2,2,2};

        int[] testRoudingNumbers = new int[9];

        RoundingNumbers roundingNumbers = new RoundingNumbers();
        roundingNumbers.rounding(numbersStrint, testRoudingNumbers);

        Arrays.equals(testRoudingNumbers, numbersInt);


    }
}