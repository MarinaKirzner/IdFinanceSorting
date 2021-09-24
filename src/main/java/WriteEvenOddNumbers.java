import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteEvenOddNumbers {

    public void writeNumbers(PrintWriter evenFile, PrintWriter oddFile, ArrayList<Integer> even, ArrayList<Integer> odd) {
        //Записываем четные
        for (Integer integer : even) {
            evenFile.println(integer);
        }

        //Записываем нечетные
        for (Integer integer : odd) {
            oddFile.println(integer);
        }
    }
}
