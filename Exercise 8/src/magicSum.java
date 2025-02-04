import java.util.Scanner;

public class magicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArray = scanner.nextLine().split(" ");
        int[] numbers = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            numbers[i] = Integer.parseInt(inputArray[i]);
        }

        int targetSum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == targetSum) {
                    System.out.println(numbers[i] + " " + numbers[j]);
                }
            }
        }
    }
}
