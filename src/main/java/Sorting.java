import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Sorting{

    public static void main(String[] args) throws FileNotFoundException {
        //Считываем данные из файла
        File dataForSorting = new File("data");
        Scanner scanner = new Scanner(dataForSorting);
        String line = scanner.nextLine();
        String[] numbersString = line.split("\\,");
        scanner.close();

        int[] numbersInt = new int[numbersString.length];

        //Округляем дробные цисла и записываем все в целочисленный массив
        RoundingNumbers.rounding(numbersString, numbersInt);

        //Создаем файлы для записи отсортированных чисел
        File evenNumbers = new File("evenNumbers");
        File oddNumbers = new File("oddNumbers");

        PrintWriter evenNumbersWriter = new PrintWriter(evenNumbers);
        PrintWriter oddNumbersWriter = new PrintWriter(oddNumbers);

        //Сортируем на четные/нечетные
        EvenOdd.sortingEvenOdd(evenNumbersWriter, oddNumbersWriter, numbersInt);

        evenNumbersWriter.close();
        oddNumbersWriter.close();

    }

}
