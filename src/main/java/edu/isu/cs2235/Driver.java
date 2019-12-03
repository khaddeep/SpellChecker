package edu.isu.cs2235;

import edu.isu.cs2235.structures.ISpellCorrector;
import edu.isu.cs2235.structures.impl.SpellCorrector;

import java.io.IOException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) throws ISpellCorrector.NoSimilarWordFoundException, IOException {

        System.out.println("\nLoading Dictionary. . . .");
        System.out.println("Dictionary Loaded. .\n");
        String dictionaryFileName = "words.txt";

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string to spellcheck (−1 to quit ) :");
        String inputWord = scanner.nextLine();
        String[] arrOfStr=inputWord.split(" ");
        System.out.println("Checking Spelling . . . \n");
        /**
         * Create an instance of your corrector here
         */
        SpellCorrector corrector = new SpellCorrector();
        System.out.println("Misspelling found : \n"+inputWord+"\n");
        System.out.println("Replace With: ");
        corrector.useDictionary(dictionaryFileName);
        for (int i=0;i<arrOfStr.length;i++){
            String suggestion = corrector.suggestSimilarWord(arrOfStr[i]);
            System.out.print(suggestion+" ");
        }
        System.out.print("\n \n \n \n \n");
    }
}
