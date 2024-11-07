import java.util.Scanner;

public class StringHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" "); // Tokenize the sentence

        // Print each word on a separate line, capitalizing the first letter
        for (String word : words) {
            System.out.println(capitalizeFirstLetter(word));
        }

        // Determine and print the number of words
        System.out.println("Number of words: " + words.length);

        // Determine and print the number of words starting with a vowel
        int vowelCount = countVowels(words);
        System.out.println("Number of words starting with a vowel: " + vowelCount);
    }

    public static String capitalizeFirstLetter(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    public static int countVowels(String[] words) {
        int count = 0;
        for (String word : words) {
            char firstLetter = word.charAt(0);
            if (isVowel(firstLetter)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isVowel(char letter) {
        letter = Character.toLowerCase(letter); // Convert to lowercase for case-insensitive check
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';
    }
}