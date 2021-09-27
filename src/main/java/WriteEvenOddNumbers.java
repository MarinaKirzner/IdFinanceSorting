import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class WriteEvenOddNumbers {

    public void writeNumber(File file, List<Integer> mass) throws FileNotFoundException {
        PrintWriter numbersWriter = new PrintWriter(file);

        //Записываем четные
        for (Integer number : mass) {
            numbersWriter.println(number);
        }

        numbersWriter.close();
    }


}
