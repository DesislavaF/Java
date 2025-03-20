import java.util.Scanner;

public class rotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArray = scanner.nextLine().split(" ");
        int[] numbers = new int[inputArray.length];
        for (int i=0; i < inputArray.length; i++) {
            numbers[i] = Integer.parseInt(inputArray[i]);
        }

        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotations; i++) {
            int firstElement = numbers[0];
            for (int j = 0; j < numbers.length -1; j++) {
                numbers[j] = numbers[j + 1];
            }
            numbers[numbers.length - 1] = firstElement;
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
