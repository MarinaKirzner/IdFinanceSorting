import java.util.ArrayList;
import java.util.List;

public class EvenOdd {

    public void sortingMass(ArrayList<Integer> mass, ArrayList<Integer> even, ArrayList<Integer> odd) {
        for (int i = 0; i < mass.size(); i++) {
            if (mass.get(i) % 2 == 0) {
                even.add(mass.get(i));
            } else odd.add(mass.get(i));
        }
    }

    public List<Integer> sorting(List<Integer> massInt, List<Integer> massSorting) {
        for (int numberMass: massInt) {
            int num = checkForSorting(numberMass);
            massSorting.add(num);
        }
        return massSorting;
    }

    private int checkForSorting(int numberMass) {
        int numberCheckTrue = 0 ;
        if (numberMass % 2 == 0) {
            numberCheckTrue = numberMass;
        }
        return numberCheckTrue;
    }

}
