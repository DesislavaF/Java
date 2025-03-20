import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");

        String[] secondArray = scanner.nextLine().split(" ");

        List<String> commonElements = new ArrayList<>();

        for(String element : secondArray) {
            for(String value:firstArray) {
                if (element.equals(value)) {
                    commonElements.add(element);
                    break;
                }
            }
        }

        for(String element: commonElements) {
            System.out.print(element + " ");
        }
    }
}
