import java.util.*;

public class WordSynonyms_02 {
    public static void main(String[] args) {
        Map<String, List<String>> synonyms = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for(int i = 1; i <= number; i++) {
            String word = scanner.next();
            String synonym = scanner.next();

            synonyms.putIfAbsent(word, new ArrayList<>());
            synonyms.get(word).add(synonym);
        }

        for(String key : synonyms.keySet()){
            System.out.println(key + " - " + String.join(", ", synonyms.get(key)));
        }
    }
}
