import java.util.Scanner;


public class topIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArray = scanner.nextLine().split(" ");
        int[] numbers = new int[inputArray.length];
        for (int i=0; i < inputArray.length; i++) {
            numbers[i] = Integer.parseInt(inputArray[i]);
        }
        for (int i=0; i < numbers.length; i++) {
            boolean isTopInteger=true;

            for (int j = i + 1; j <numbers.length; j++){
                if (numbers[i] <= numbers[j]) {
                    isTopInteger = false;
                    break;

                }
            }

            if (isTopInteger) {
                System.out.print(numbers[i] + " ");

            }
        }

    }
}

