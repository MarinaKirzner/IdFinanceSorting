import java.util.ArrayList;

public class EvenOdd {

    public void sorting(ArrayList<Integer> mass, ArrayList<Integer> even, ArrayList<Integer> odd) {
        for (int i = 0; i < mass.size(); i++) {
            if (mass.get(i) % 2 == 0) {
                even.add(mass.get(i));
            } else odd.add(mass.get(i));
        }

    }
}
