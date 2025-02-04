import java.util.Scanner;

public class theLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int peopleInQueue = Integer.parseInt(scanner.nextLine());
        String[] liftInput = scanner.nextLine().split(" ");
        int[] lift = new int[liftInput.length];


        for (int i = 0; i < liftInput.length; i++) {
            lift[i] = Integer.parseInt(liftInput[i]);
        }


        for (int i = 0; i < lift.length; i++) {
            while (lift[i] < 4 && peopleInQueue > 0) {
                lift[i]++;
                peopleInQueue--;
            }
        }

        boolean hasEmptySpots = false;
        for (int wagon : lift) {
            if (wagon < 4) {
                hasEmptySpots = true;
                break;
            }
        }

        if (peopleInQueue == 0 && hasEmptySpots) {
            System.out.println("The lift has empty spots!");
        } else if (peopleInQueue > 0) {
            System.out.println("There isn't enough space! " + peopleInQueue + " people in a queue!");
        }

        for (int wagon : lift) {
            System.out.print(wagon + " ");
        }
    }
}