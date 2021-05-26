import java.util.*;

public class SequenceGenerator {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int number;
        number = scanner.nextInt();

        SequenceGenerator sequenceGenerator = new SequenceGenerator();
        CollatzSequence collatzSequence = new CollatzSequence(number);

        if (sequenceGenerator.validateNumber(number)) {
            ArrayList<Integer> collatzSequenceList = collatzSequence.generateCollatzSequence();
            for (int i = 0; i < collatzSequenceList.size(); i++) {
                System.out.println(collatzSequenceList.get(i));
            }
        } else {
            System.out.println("Invalid input");
        }
    }

    public boolean validateNumber(int number) {
        return number > 0;
    }
}
