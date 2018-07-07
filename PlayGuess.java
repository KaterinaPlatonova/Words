package geekbrains.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PlayGuess {

    String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
            "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
            "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    Random random = new Random();
    Scanner scan = new Scanner(System.in);
    private String theWord;
    private String userWord;

    protected String getTheWord() {
        return theWord;
    }

    protected String getUserWord() {
        return userWord;
    }

    protected String makeTheWord() {
        int i = random.nextInt(26);
        theWord = words[i];
        return theWord;
    }

    protected String askUserWord() {
        System.out.println("Guess the word: apple, orange, lemon, banana, apricot, avocado, broccoli, carrot,\n" +
                "            cherry, garlic, grape, melon, leak, kiwi, mango, mushroom, nut, olive, pea,\n" +
                "            peanut, pear, pepper, pineapple, pumpkin, potato");

        System.out.println("Введите Ваше слово");
        userWord = scan.next();
        return userWord;
    }

    protected boolean compareWords() {
        ArrayList str = new ArrayList();
        for (int i = 0; i < theWord.length(); i++) {
            if (userWord.equals(theWord)) {
                System.out.println("Вы угадали! Спасибо за игру!");
                break;
            } else {
                System.out.println("Вы не угадали слово. Будет подсказка");

                str.add(theWord.charAt(i));
                System.out.println(str + "###############");
                askUserWord();
            }
        }
        return true;
    }
}