import java.util.*;

public class CountRealNumbers_01 {
    public static void main(String[] args) {
        Map<String, Integer> counter = new HashMap<>();

        String input = new Scanner(System.in).nextLine();
        String[] numbers = input.split(" ");

        for (String number : numbers) {
            if (counter.containsKey(number)) {
                int count = counter.get(number) + 1;
                counter.put(number, count);
            } else {
                counter.put(number, 1);
            }
        }

        for (String key : counter.keySet()) {
            System.out.println(key + " -> " + counter.get(key));
        }
    }
}
