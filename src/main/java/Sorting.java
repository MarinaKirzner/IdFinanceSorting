import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Sorting{

    public static void main(String[] args) throws FileNotFoundException {
        //Считываем данные из файла
        File dataForSorting = new File("src\\main\\resources\\dataForProgramm\\data");
        Scanner scanner = new Scanner(dataForSorting);
        String line = scanner.nextLine();
        String[] numbersString = line.split("\\,");
        scanner.close();

        //Округляем дробные цисла и записываем все в целочисленный массив
        RoundingNumbers roundingNumbers = new RoundingNumbers();
        int[] numbersInt = new int[numbersString.length];
        roundingNumbers.rounding(numbersString, numbersInt);

        //Сортируем на четные/нечетные
        EvenOdd evenOdd = new EvenOdd();
        ArrayList<Integer> evenSorting = new ArrayList<>();
        ArrayList<Integer> oddSorting = new ArrayList<>();

        //Переводим целочисленный массив в список для дальнейшей сортировки
        ArrayList<Integer> numbersListInt = new ArrayList<>();
        for (int numbers : numbersInt) {
            numbersListInt.add(numbers);
        }

        //Сортируем
        evenOdd.sorting(numbersListInt, evenSorting, oddSorting);

        //Создаем файлы для записи отсортированных чисел
        File evenNumbers = new File("src\\main\\resources\\dataForProgramm\\evenNumbers");
        File oddNumbers = new File("src\\main\\resources\\dataForProgramm\\oddNumbers");
        PrintWriter evenNumbersWriter = new PrintWriter(evenNumbers);
        PrintWriter oddNumbersWriter = new PrintWriter(oddNumbers);

        //Записываем в файлы
        WriteEvenOddNumbers writeEvenOddNumbers = new WriteEvenOddNumbers();
        writeEvenOddNumbers.writeNumbers(evenNumbersWriter, oddNumbersWriter, evenSorting, oddSorting);

        evenNumbersWriter.close();
        oddNumbersWriter.close();

    }

}
