import java.util.*;
import java.util.stream.Stream;

public class main {

    private static boolean check = true;

    public static void main(String[] args) {

        Stream.iterate(0, n -> n+1)
                .map(n -> (n*(n + 1))/2)
                .limit(10)
                .forEach(System.out::println);


        ArrayList<String> stopWords = new ArrayList<>();
        stopWords.addAll(List.of("a", "an", "the", "so", "it", "do", "did", "for", "by", "of", "to"));

        LinkedList<String> words = new LinkedList<>();

        Scanner myScanner = new Scanner(System.in);

        while (check){
            System.out.print("Enter word: ");
            String word = myScanner.nextLine();
            if (word.length() != 0) {
                words.add(word);
            } else {
                check = false;
            }
        }

        words.sort(Comparator.reverseOrder());

        words.stream()
                .filter(w -> !stopWords.contains(w))
                .distinct()
                .forEach(System.out::println);

    }
}
