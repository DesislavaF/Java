import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class train{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());


        List<Integer> wagons = new ArrayList<>();


        int totalPeople = 0;


        for (int i = 0; i < n; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            wagons.add(people);
            totalPeople += people;
        }


        for (int wagon : wagons) {
            System.out.print(wagon + " ");
        }

        System.out.println();


        System.out.println(totalPeople);
    }
}
