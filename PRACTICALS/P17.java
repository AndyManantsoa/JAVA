//17. Write a Java program that displays the number of characters, lines and words in a text?

import java.util.Scanner;

public class P17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text:");
        String text = scanner.nextLine();

        int charCount = countCharacters(text);
        int lineCount = countLines(text);
        int wordCount = countWords(text);

        System.out.println("Text Statistics:");
        System.out.println("Characters: " + charCount);
        System.out.println("Lines: " + lineCount);
        System.out.println("Words: " + wordCount);
    }

    public static int countCharacters(String text) {
        return text.length();
    }

    public static int countLines(String text) {
        String[] lines = text.split("\n");
        return lines.length;
    }

    public static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }
}