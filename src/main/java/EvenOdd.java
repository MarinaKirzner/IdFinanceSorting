import java.io.File;
import java.io.PrintWriter;

public class EvenOdd {
    public static void sorting(PrintWriter even, PrintWriter odd, int[] mass) {
        //Проверка на четные/нечетные
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 == 0) {
                even.println(mass[i]);
            } else odd.println(mass[i]);
        }

    }
}
