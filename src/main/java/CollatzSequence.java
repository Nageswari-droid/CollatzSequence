import java.util.*;

public class CollatzSequence {
    int number;
    ArrayList<Integer> sequenceList;

    public CollatzSequence(int number) {
        this.number = number;
        this.sequenceList = new ArrayList<>(Arrays.asList(number));
    }

    public ArrayList<Integer> generateCollatzSequence() {
        do {

            number = (number % 2 == 0) ? evenNumberResult(number) : oddNumberResult(number);
            sequenceList.add(number);

        } while (number != 1);

        return sequenceList;
    }

    public int evenNumberResult(int evenNumber) {
        return evenNumber / 2;
    }

    public int oddNumberResult(int oddNumber) {
        return ((3 * oddNumber) + 1);
    }
}
