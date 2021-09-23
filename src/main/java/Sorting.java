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
        double[] numbersDouble = new double[numbersString.length];

        //Перевод строкового массива в целочисленный массив
        for (int i = 0; i < numbersString.length; i++) {
            if (numbersString[i].contains(".")){
                numbersDouble[i] = Double.parseDouble(numbersString[i]);
                numbersInt[i] = (int) Math.round(numbersDouble[i]);
            }
            else numbersInt[i] = Integer.parseInt(numbersString[i]);
        }

        //Создаем файлы для записи отсортированных чисел
        File evenNumbers = new File("evenNumbers");
        File oddNumbers = new File("oddNumbers");

        PrintWriter evenNumbersWriter = new PrintWriter(evenNumbers);
        PrintWriter oddNumbersWriter = new PrintWriter(oddNumbers);

        EvenOdd.sorting(evenNumbersWriter, oddNumbersWriter, numbersInt);

        evenNumbersWriter.close();
        oddNumbersWriter.close();

    }

}
