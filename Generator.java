import java.util.ArrayList;

public class Generator {

    private final Numbers numbers;
    private Tally tally1;
    private Tally tally2;
    private Tally tally3;
    private Tally tally4;
    private Tally tally5;
    private Tally tally6;

    public Generator() {
        numbers = new Numbers();
        makeTallies();
    }

    public void generate() {
        ArrayList<String> winningNumbers = numbers.getNumbers();

        for (String number : winningNumbers) {
            for (int i = 0; i < number.length(); i++) {
                String character = String.valueOf(number.charAt(i));

                switch (i) {
                    case 0:
                        tally1.incrementTally(character);
                        break;
                    case 1:
                        tally2.incrementTally(character);
                        break;
                    case 2:
                        tally3.incrementTally(character);
                        break;
                    case 3:
                        tally4.incrementTally(character);
                        break;
                    case 4:
                        tally5.incrementTally(character);
                        break;
                    case 5:
                        tally6.incrementTally(character);
                        break;
                }
            }
        }

        String bestNumber = tally1.getMostCommon()
                + tally2.getMostCommon()
                + tally3.getMostCommon()
                + tally4.getMostCommon()
                + tally5.getMostCommon()
                + tally6.getMostCommon();

        System.out.println(bestNumber);
    }

    private void makeTallies() {
        tally1 = new Tally();
        tally2 = new Tally();
        tally3 = new Tally();
        tally4 = new Tally();
        tally5 = new Tally();
        tally6 = new Tally();
    }
}
