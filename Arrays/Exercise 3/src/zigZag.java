import java.util.Scanner;

public class zigZag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int n = Integer.parseInt(scanner.nextLine());

       int[] firstArray = new int[n];
       int[] secondArray = new int[n];

       for (int i = 0; i < n; i++) {
           String[] input = scanner.nextLine().split(" ");
           int firstNum = Integer.parseInt(input[0]);
           int secondNum = Integer.parseInt(input[1]);

           if (i % 2 == 0) {
               firstArray[i] = firstNum;
               secondArray[i] = secondNum;
           }else {
               firstArray[i] = secondNum;
               secondArray[i] = firstNum;
           }
       }

       for (int num : firstArray) {
           System.out.print(num + " ");
       }
       System.out.println();

       for (int num : secondArray) {
           System.out.print(num + " ");
       }
    }
}
