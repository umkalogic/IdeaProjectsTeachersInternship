import java.util.ArrayList;
import java.util.Random;

public class PlayJava {
    private int rangeStart;
    private int rangeEnd;
    private int answer;
    private int guess;
    public ArrayList<Integer> guessHistory = new ArrayList<>();

    public void setGuess(int guess) {
        this.guess = guess;
    }
    public void setRangeStart(int rangeStart) {
        this.rangeStart = rangeStart;
    }
    public void setRangeEnd(int rangeEnd) {
        this.rangeEnd = rangeEnd;
    }
    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public int getRangeStart() {
        return rangeStart;
    }
    public int getRangeEnd() {
        return rangeEnd;
    }
    public int getGuess() { return guess; }
    public ArrayList<Integer> getGuessHistory() { return guessHistory; }

    boolean tryguess(int _guess) {
        guessHistory.add(_guess);
        setGuess(_guess);
        if (guess == answer) {
            return true;
        }
        else {
            return false;
        }
    }
    boolean guessisgreater() {
        if (guess > answer) {
            return true;
        }
        else {
            return false;
        }
    }
    public static int rand() {
        Random rand = new Random();
        return rand.nextInt();
    }
    public static int rand(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
 /*

        Scanner in = new Scanner(System.in);
        System.out.println("Insert minimum and maximum integer range values, from which " +
                           "the number would be guessed: ");
        System.out.print("minimum range value: ");
        rangeStart = in.nextInt();

        System.out.print("maximum range value: ");
        rangeEnd = in.nextInt();

        answer = rand(rangeStart, rangeEnd);

        System.out.println("The number from "+ rangeStart + " to " + rangeEnd + " has been proposed.");
        System.out.println("Try to guess it.");

        PlayJava playgame = new PlayJava(rangeStart, rangeEnd, answer);

        boolean resulttryguess = false;
        do {
            System.out.println("Enter an integer number between " + playgame.getRangeStart() +
                    " and " + playgame.getRangeEnd() + " ");
            guess = in.nextInt();

            playgame.setGuess(guess);

            if (playgame.tryguess(guess)) {
                resulttryguess = true;
            } else {
                resulttryguess = false;
            }
            if (resulttryguess) {
                System.out.println("Hooray! You've guessed the right number! Congrats!");
                resulttryguess = false;
                break;
            } else {
                if (playgame.guessisgreater()) {
                    System.out.println("Oopss! You've guessed the wrong number");
                    System.out.println("Your number " + guess + " is greater then the right number.");
                    System.out.println("Try once more.");
                    playgame.setRangeEnd(guess);
                    resulttryguess = false;

                } else {
                    System.out.println("Oopss! You've guessed the wrong number");
                    System.out.println("Your number " + guess + " is less then the right number.");
                    System.out.println("Try once more.");
                    playgame.setRangeStart(guess);
                    resulttryguess = false;

                }
            }
        } while(!resulttryguess);
        in.close();
   */
}
