package exercise;

public class FizzBuzz {

    public static final String FIZZ_BUZZ = "FizzBuzz\n";
    public static final String FIZZ = "Fizz\n";
    public static final String BUZZ = "Buzz\n";
    public static final String NEWLINE = "\n";

    public String returnNumbers(Integer maxNumber) {
        String numbers = "";

        for (Integer initNumber = 1; initNumber < maxNumber + 1; initNumber++) {
            if (initNumber % 3 == 0 && initNumber % 5 == 0) {
                numbers += FIZZ_BUZZ;
            } else if (initNumber % 3 == 0) {
                numbers += FIZZ;
            } else if (initNumber % 5 == 0) {
                numbers += BUZZ;
            } else {
                numbers += initNumber.toString() + NEWLINE;
            }
        }

        return numbers;
    }
}