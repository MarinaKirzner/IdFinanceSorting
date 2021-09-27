import com.beust.jcommander.internal.Lists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sorting{

    public static final String FILE_PATH = "src\\main\\resources\\dataForProgramm\\";

    public static void main(String[] args) throws FileNotFoundException {
        //Считываем данные из файла
        File dataForSorting = new File(FILE_PATH + "data");
        Scanner scanner = new Scanner(dataForSorting);
        String line = scanner.nextLine();
        String[] numbersString = line.split("\\,");
        List<String> numbersStringList = Arrays.asList(numbersString);
        scanner.close();

        //Округляем дробные цисла и записываем все в целочисленный массив
        RoundingNumbers roundingNumbers = new RoundingNumbers();
        List<Integer> roundingIntList = new ArrayList<>();
        roundingNumbers.roundListNumbers(numbersStringList, roundingIntList);

        //Сортируем на четные/нечетные
        EvenOdd evenOdd = new EvenOdd();
        List<Integer> evenSorting = new ArrayList<>();
        List<Integer> oddSorting = new ArrayList<>();

        evenOdd.sorting(roundingIntList, evenSorting);
        evenOdd.sorting(roundingIntList, oddSorting);

        //Записываем в файлы
        File evenNumbers = new File(FILE_PATH + "evenNumbers");
        File oddNumbers = new File(FILE_PATH + "oddNumbers");

        WriteEvenOddNumbers writeEvenOddNumbers = new WriteEvenOddNumbers();
        writeEvenOddNumbers.writeNumber(evenNumbers, evenSorting);
        writeEvenOddNumbers.writeNumber(oddNumbers, oddSorting);

    }

}
