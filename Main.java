package geekbrains.Java;

public class Main {

    public static void main(String[] args) {
        PlayGuess play = new PlayGuess();
        play.makeTheWord();
        while (play.getUserWord() != play.getTheWord()) {
            play.askUserWord();
            play.compareWords();
        }


    }
}
