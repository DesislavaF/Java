import java.util.Scanner;

public class equalSums {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] inputArray = scanner.nextLine().split(" ");
        int[] numbers = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            numbers[i] = Integer.parseInt(inputArray[i]);
        }

        boolean foundIndex = false;

        for (int i = 0; i < numbers.length; i++) {
            int leftSum=0;
            int rightSum=0;

            for (int j = 0; j < i; j++) {
                leftSum += numbers[j];
            }

            for (int j = i + 1; j < numbers.length; j++) {
                rightSum+= numbers[j];
            }

            if (leftSum == rightSum) {
                System.out.print(i);
                foundIndex = true;
                break;
            }
        }

        if (!foundIndex) {
            System.out.println("no");
        }
    }
}
