import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.lang.StringBuilder;

public class Dictionary {
    public static void main(String[] args) throws Exception {
        BufferedReader inputStream = null;
        HashSet<String> dictionary = new HashSet<String>();
        Scanner keyboard = new Scanner(System.in);
        String line = "";

        try {
            // Read file and adds words to the dictionary hashset
            inputStream = new BufferedReader(new FileReader("dictionary.txt"));

            while ((line = inputStream.readLine()) != null) {
                dictionary.add(line.toLowerCase());
            }

            // Prompt user for sentence input
            System.out.println("Please enter a sentence: ");
            String sentence[] = keyboard.nextLine().split(" ");
            keyboard.close();

            // Removes punctuation
            for (int i = 0;  i < sentence.length; i++) {
                StringBuilder sb = new StringBuilder(sentence[i]);
                System.out.println("Word:" + sb.toString());

                for (int j = 0; j < sb.length(); j++) {
                    char character = sb.charAt(j);
                    System.out.println("> Char " + j + ": " + character);

                    if ((!(character >= 'A' && character <= 'Z') && !(character >= 'a' && character <= 'z'))) {
                        sb.deleteCharAt(j);
                        System.out.println("   > Deleted " + character);
                    }                    
                }

                sentence[i] = sb.toString();
            }

            // Spell check
            System.out.println("\nSpell check of your sentence:");

            for (int i = 0; i < sentence.length; i++) {
                if (dictionary.contains(sentence[i].toLowerCase())) {
                    System.out.println((i + 1) + ". " + sentence[i] + " <valid>");
                } else {
                    System.out.println((i + 1) + ". " + sentence[i] + " <invalid>");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error opening file");
        } catch (IOException e) {
            System.out.println("Error creating file");
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }
}