import java.util.ArrayList;
import java.util.List;

public class RoundingNumbers {

    private static final String DOUBLE_DELIMITER = "." ;

    public List<Integer> roundListNumbers(List<String> numbers, List<Integer> roundedNumbers) {
        for (String number : numbers) {
            int convertedNumber = convertStringToInt(number);
            roundedNumbers.add(convertedNumber);
        }
        return roundedNumbers;
    }

    private Integer convertStringToInt(String number) {
        int valueToAdd;
        if (isDouble(number)) {
            double convertedToDouble = Double.parseDouble(number);
            valueToAdd = (int) Math.round(convertedToDouble);
        } else {
            valueToAdd = Integer.parseInt(number);
        }
        return valueToAdd;
    }

    private boolean isDouble(String number) {
        return number.contains(DOUBLE_DELIMITER);
    }


}
