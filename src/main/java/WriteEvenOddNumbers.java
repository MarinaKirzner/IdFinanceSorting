import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteEvenOddNumbers {

    public void writeNumbers(File evenFile, File oddFile, ArrayList<Integer> evens, ArrayList<Integer> odds) throws FileNotFoundException {
        PrintWriter evenNumbersWriter = new PrintWriter(evenFile);
        PrintWriter oddNumbersWriter = new PrintWriter(oddFile);

        //Записываем четные
        for (Integer even : evens) {
            evenNumbersWriter.println(even);
        }

        //Записываем нечетные
        for (Integer odd : odds) {
            oddNumbersWriter.println(odd);
        }

        evenNumbersWriter.close();
        oddNumbersWriter.close();
    }
}
