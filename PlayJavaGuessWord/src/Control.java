import java.util.Scanner;

public class Control {
    private PlayJava model;
    private View view;

    public Control(PlayJava model, View view) {
        this.model = model;
        this.view = view;
    }

    //Work method
    public void processUserInput() {
        Scanner in = new Scanner(System.in);

        view.printMessage(View.INPUT_RANGE);
        view.printMessage(View.RANGE_START + View.VALUE);
        model.setRangeStart(inputPosIntValueWithScannerGreaterThen2Parameter(in, -1));

        view.printMessage(View.RANGE_END + View.VALUE);
        model.setRangeEnd(inputPosIntValueWithScannerGreaterThen2Parameter(in, model.getRangeStart()));

        /*
        System.out.println("Insert minimum and maximum integer range values, from which " +
                "the number would be guessed: ");
        System.out.print("minimum range value: ");
        rangeStart = in.nextInt();

        System.out.print("maximum range value: ");
        rangeEnd = in.nextInt(); */

        int rangeStart = model.getRangeStart();
        int rangeEnd = model.getRangeEnd();
        int answer = model.rand(rangeStart, rangeEnd);
        model.setAnswer(answer);

        boolean resulttryguess = false;
        int guess;
        do {
            /*  System.out.println("Enter an integer number between " + playgame.getRangeStart() +
                    " and " + playgame.getRangeEnd() + " ");
            guess = in.nextInt(); */
            view.printMessage(View.INPUT_TRY + model.getRangeStart() + View.AND
                              + model.getRangeEnd() + View.DOT);
            view.printMessage(View.INPUT + View.VALUE);
            model.setGuess(inputIntValueWithScannerAndRange(in));
            guess = model.getGuess();
            if (model.tryguess(guess)) {
                resulttryguess = true;
            } else {
                resulttryguess = false;
            }
            if (resulttryguess) {
                view.printMessage(View.HOORAY);
                view.printMessage(View.YOUR_GUESS_HISTORY
                        + model.getGuessHistory()
                        + View.DOT);
                resulttryguess = false;
                break;
            } else {
                if (model.guessisgreater()) {
                    view.printMessage(View.OOPS);
                    view.printMessage(View.YOUR_NUMBER +
                             + guess + View.IS_GREATER_THEN);
                    view.printMessage(View.TRY_ONCE_MORE);
                    model.setRangeEnd(guess);
                    resulttryguess = false;

                } else {
                    view.printMessage(View.OOPS);
                    view.printMessage(View.YOUR_NUMBER +
                            + guess + View.IS_LESS_THEN);
                    view.printMessage(View.TRY_ONCE_MORE);
                    model.setRangeStart(guess);
                    resulttryguess = false;

                }
            }
        } while(!resulttryguess);

        in.close();
    }
    // The Utility methods
    public int inputPosIntValueWithScannerGreaterThen2Parameter(Scanner sc, int compare) {
        int res = 0;
        while (true) {
            //check int
            while (!sc.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT_POS_INT);
                view.printMessage(View.POS_INT + View.VALUE);
                sc.next();
            }
            // check positive value
            if ((res = sc.nextInt()) <= compare) {
                if(compare == 0)
                    view.printMessage(View.WRONG_INPUT_POS_INT);
                else
                    view.printMessage(View.WRONG_INPUT_INT_GREATER_THEN + model.getRangeStart() + View.DOT);
                view.printMessage(View.POS_INT + View.VALUE);
                continue;
            }
            break;
        }
        return res;
    }

    public int inputIntValueWithScannerAndRange(Scanner sc) {
        int res = 0;

        while( true ) {
            // check int - value
            while (!sc.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT_DATA);
                view.printMessage(View.POS_INT + View.VALUE);
                sc.next();
            }
            // check value within range
            if ((res = sc.nextInt()) <= model.getRangeStart() ||
                    res >= model.getRangeEnd()) {
                view.printMessage(View.WRONG_INPUT_DATA
                        + model.getRangeStart() + View.AND
                        + model.getRangeEnd() + View.DOT);
                view.printMessage(View.POS_INT + View.VALUE);
                continue ;
            }
            break;
        }
        return res;
    }
}
