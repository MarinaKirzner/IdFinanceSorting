import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.util.*;


public class EvenOddTest {

    @Test
    public void testSortingEvenOdd() throws FileNotFoundException {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        ArrayList<Integer> numbersEven = new ArrayList<>();
        numbersEven.add(2);
        numbersEven.add(4);
        numbersEven.add(6);

        ArrayList<Integer> numbersOdd = new ArrayList<>();
        numbersOdd.add(1);
        numbersOdd.add(3);
        numbersOdd.add(5);

        EvenOdd evenOdd = new EvenOdd();
        ArrayList<Integer> testEvenSorting = new ArrayList<>();
        ArrayList<Integer> testOddSorting = new ArrayList<>();
        evenOdd.sorting(numbers, testEvenSorting, testOddSorting);

        Assert.assertEquals(testEvenSorting, numbersEven);
        Assert.assertEquals(testOddSorting, numbersOdd);

    }
}