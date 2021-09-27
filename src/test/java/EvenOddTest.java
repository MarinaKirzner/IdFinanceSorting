import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.util.*;


public class EvenOddTest {

    @Test
    public void testSortingEvenOdd() throws FileNotFoundException {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, -1);
        List<Integer> numbersEven = Arrays.asList(2, 4, 6);
        List<Integer> numbersOdd = Arrays.asList(1, 3, 5, -1);

        EvenOdd evenOdd = new EvenOdd();
        ArrayList<Integer> testEvenSorting = new ArrayList<>();
        ArrayList<Integer> testOddSorting = new ArrayList<>();
        evenOdd.sorting(numbers, testEvenSorting);
        evenOdd.sorting(numbers, testOddSorting);

        Assert.assertEquals(testEvenSorting, numbersEven);
        Assert.assertEquals(testOddSorting, numbersOdd);

    }
}