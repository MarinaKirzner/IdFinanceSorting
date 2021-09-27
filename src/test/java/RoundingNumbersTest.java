import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class RoundingNumbersTest {

    @Test
    public void testRounding() {

        List<String> numbersStrintList = Arrays.asList("2","2.0","2.1","2.4","2.5","2.9","1.9","1.9999","2.0001");
        List<Integer> numbersIntList = Arrays.asList(2,2,2,2,3,3,2,2,2);
        List<Integer> testRoudingNumbersList = new ArrayList<>();

        RoundingNumbers roundingNumbers = new RoundingNumbers();
        roundingNumbers.roundListNumbers(numbersStrintList, testRoudingNumbersList);

        Assert.assertEquals(testRoudingNumbersList, numbersIntList);


    }
}