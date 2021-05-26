import java.util.*;

public class CollatzSequence {
    int number;
    ArrayList<Integer> sequenceList;

    public CollatzSequence(int number) {
        this.number = number;
        this.sequenceList = new ArrayList<>(Arrays.asList(number));
    }

    public ArrayList<Integer> generateCollatzSequence() {
        while (number != 1) {
            if (number % 2 == 0) {
                number = getEvenNumberResult(number);
            } else {
                number = getOddNumberResult(number);
            }
            sequenceList.add(number);
        }
        return sequenceList;
    }

    public int getEvenNumberResult(int evenNumber) {
        return evenNumber / 2;
    }

    public int getOddNumberResult(int oddNumber) {
        return ((3 * oddNumber) + 1);
    }
}
