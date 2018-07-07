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

    protected String getTheWord() { return theWord; }

    protected String getUserWord() { return userWord; }

    protected String makeTheWord() { // метод произвольно загадывает слово
        int i = random.nextInt(26);
        theWord = words[i];
        return theWord;
    }

    protected String askUserWord() { // метод запрашивает слово у игрока
        System.out.println("Guess the word: apple, orange, lemon, banana, apricot, avocado, broccoli, carrot,\n" +
                "            cherry, garlic, grape, melon, leak, kiwi, mango, mushroom, nut, olive, pea,\n" +
                "            peanut, pear, pepper, pineapple, pumpkin, potato");

        System.out.println("Введите Ваше слово");
        userWord = scan.next();
        return userWord;
    }

    protected boolean compareWords() { // метод сравнивает загаданное слово и введенное
        ArrayList str = new ArrayList(); // массив для добавления побуквенно загаданного слова
        for (int i = 0; i < theWord.length(); i++) {
            if (userWord.equals(theWord)) {
                System.out.println("Вы угадали! Спасибо за игру!");
                break;
            } else {
                System.out.println("Вы не угадали слово. Будет подсказка");
                str.add(theWord.charAt(i)); // добавление буквы загаданного слова в массив
                System.out.println(str + "###############"); // вывод подсказки, очередной буквы в загаданном слове
                askUserWord();
            }
        }
        return true;
    }
}